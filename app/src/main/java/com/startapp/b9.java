package com.startapp;

import com.ironsource.b9;
import java.util.regex.Pattern;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class b9 {

    /* renamed from: a  reason: collision with root package name */
    public final Pattern f21800a = Pattern.compile("\\+");

    /* renamed from: b  reason: collision with root package name */
    public final Pattern f21801b = Pattern.compile("/");

    /* renamed from: c  reason: collision with root package name */
    public final Pattern f21802c = Pattern.compile(b9.i.f16692b);

    public b9() {
        Pattern.compile("_");
        Pattern.compile("\\*");
        Pattern.compile("#");
    }

    public final String a(String str) {
        return this.f21802c.matcher(this.f21801b.matcher(this.f21800a.matcher(str).replaceAll("_")).replaceAll("*")).replaceAll("#");
    }
}
