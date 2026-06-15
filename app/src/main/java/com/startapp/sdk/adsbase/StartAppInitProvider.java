package com.startapp.sdk.adsbase;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import com.startapp.f0;
import com.startapp.m8;
import com.startapp.sdk.adsbase.StartAppSDKInternal;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class StartAppInitProvider extends ContentProvider {
    @Override // android.content.ContentProvider
    public final void attachInfo(Context context, ProviderInfo providerInfo) {
        super.attachInfo(context, providerInfo);
        Object obj = StartAppSDKInternal.C;
        Context a10 = f0.a(context);
        if (a10 != null) {
            context = a10;
        }
        StartAppSDKInternal.c.f22944a.d(context);
        com.startapp.sdk.components.a.a(context).f23248x.a().execute(new m8(context));
    }

    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        return false;
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }
}
