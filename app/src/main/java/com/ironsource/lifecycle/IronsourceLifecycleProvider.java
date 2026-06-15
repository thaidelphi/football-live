package com.ironsource.lifecycle;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class IronsourceLifecycleProvider extends ContentProvider {

    /* renamed from: a  reason: collision with root package name */
    private static boolean f18219a = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean a() {
        return f18219a;
    }

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        f18219a = true;
        b.d().a(getContext());
        return true;
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }
}
