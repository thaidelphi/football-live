package com.ironsource.environment;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.UriMatcher;
import android.database.Cursor;
import android.net.Uri;
import com.ironsource.fa;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class CrashProvider extends ContentProvider {

    /* renamed from: a  reason: collision with root package name */
    Context f17256a;

    /* renamed from: b  reason: collision with root package name */
    fa f17257b;

    /* renamed from: c  reason: collision with root package name */
    String f17258c;

    /* renamed from: e  reason: collision with root package name */
    Uri f17260e;

    /* renamed from: h  reason: collision with root package name */
    String f17263h;

    /* renamed from: i  reason: collision with root package name */
    String f17264i;

    /* renamed from: d  reason: collision with root package name */
    UriMatcher f17259d = new UriMatcher(-1);

    /* renamed from: f  reason: collision with root package name */
    final int f17261f = 1;

    /* renamed from: g  reason: collision with root package name */
    final int f17262g = 2;

    /* renamed from: j  reason: collision with root package name */
    final String f17265j = "REPORTS";

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        int match = this.f17259d.match(uri);
        if (match != 1) {
            if (match == 2) {
                return this.f17264i;
            }
            throw new IllegalArgumentException("Invalid URI: " + uri);
        }
        return this.f17263h;
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        this.f17256a = getContext();
        this.f17257b = new fa(this.f17256a);
        this.f17258c = this.f17256a.getPackageName();
        this.f17260e = Uri.parse("content://" + this.f17258c + "/REPORTS");
        this.f17263h = "vnd.android.cursor.dir/CrashReporter.Reports";
        this.f17264i = "vnd.android.cursor.item/CrashReporter/Reports";
        return true;
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        int match = this.f17259d.match(uri);
        if (match != 1) {
            if (match == 2) {
                return fa.a(Integer.parseInt(uri.getLastPathSegment()));
            }
            throw new IllegalArgumentException("Invalid URI: " + uri);
        }
        return fa.c();
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }
}
