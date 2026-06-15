package com.appnext.core;

import android.content.Context;
import java.util.ArrayList;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class AppnextSDK {
    public static void sendRA(Context context, ArrayList<String> arrayList) {
        com.appnext.core.ra.services.a.s(context.getApplicationContext()).e(arrayList);
    }
}
