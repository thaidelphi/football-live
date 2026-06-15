package com.google.android.gms.common.internal;

import android.net.Uri;
/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class zzu {

    /* renamed from: a  reason: collision with root package name */
    private static final Uri f12629a;

    /* renamed from: b  reason: collision with root package name */
    private static final Uri f12630b;

    static {
        Uri parse = Uri.parse("https://plus.google.com/");
        f12629a = parse;
        f12630b = parse.buildUpon().appendPath("circles").appendPath("find").build();
    }
}
