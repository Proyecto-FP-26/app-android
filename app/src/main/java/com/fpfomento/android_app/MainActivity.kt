package com.fpfomento.android_app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.fpfomento.android_app.api.ReportsApi
import com.fpfomento.android_app.api.models.ReportResponse
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    @Inject
    lateinit var reportsApi: ReportsApi

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            MaterialTheme {
                ReportsListScreen(api = reportsApi)
            }
        }
    }
}

@Composable
fun ReportsListScreen(api: ReportsApi) {
    var reports by remember { mutableStateOf<List<ReportResponse>>(emptyList()) }
    var error by remember { mutableStateOf<String?>(null) }
    var loading by remember { mutableStateOf(true) }

    // Ejecuta la petición automáticamente al entrar en la pantalla
    LaunchedEffect(Unit) {
        try {
            val response = api.getReportsReportsGet()   // ← AHORA SÍ FUNCIONA
            reports = response.reports
        } catch (e: Exception) {
            error = e.message ?: "Unknown error"
        } finally {
            loading = false
        }
    }

    when {
        loading -> {
            Box(
                Modifier.fillMaxSize(),
                contentAlignment = Alignment.Center
            ) {
                CircularProgressIndicator()
            }
        }

        error != null -> {
            Text(
                text = "Error: $error",
                modifier = Modifier.padding(16.dp)
            )
        }

        else -> {
            LazyColumn(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(16.dp)
            ) {
                items(reports) { report ->
                    ReportItem(report)
                    Divider()
                }
            }
        }
    }
}

@Composable
fun ReportItem(report: ReportResponse) {
    Column(modifier = Modifier.padding(8.dp)) {
        Text(text = report.title, style = MaterialTheme.typography.titleMedium)
        Text(text = report.description, style = MaterialTheme.typography.bodyMedium)
        Text(text = "Estado: ${report.status}", style = MaterialTheme.typography.bodySmall)
    }
}
