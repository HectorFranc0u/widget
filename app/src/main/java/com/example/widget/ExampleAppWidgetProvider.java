package com.example.widget;

import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.Context;
import android.content.Intent;
import android.widget.RemoteViews;

public class ExampleAppWidgetProvider extends AppWidgetProvider{
    // hacemos un onUpdate para dar funcionalidad a los botones de nuestro widget
    @Override
    public void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] appWidgetIds) {
        for(int appWidgetID : appWidgetIds){

            // Creamos los intents que abriran las activities
            Intent intentcanvas = new Intent(context, MainActivity.class);
            PendingIntent pendingIntentcanvas = PendingIntent.getActivity(context, 0, intentcanvas, 0);

            Intent intentnotas = new Intent(context, MainActivity2.class);
            PendingIntent pendingIntentnotas = PendingIntent.getActivity(context, 0, intentnotas, 0);

            // creamos la view de nuestro widget, y damos funcionlidad
            // a los botones que se encuentran en el layout del widget
            RemoteViews views = new RemoteViews(context.getPackageName(), R.layout.example_widget);
            views.setOnClickPendingIntent(R.id.button_widget, pendingIntentcanvas);
            views.setOnClickPendingIntent(R.id.button_widget2, pendingIntentnotas);

            appWidgetManager.updateAppWidget(appWidgetID, views);
        }
    }
}
