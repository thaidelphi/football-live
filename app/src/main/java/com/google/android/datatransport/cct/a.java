package com.google.android.datatransport.cct;

import b3.g;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;
/* compiled from: CCTDestination.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class a implements g {

    /* renamed from: c  reason: collision with root package name */
    static final String f10408c;

    /* renamed from: d  reason: collision with root package name */
    static final String f10409d;

    /* renamed from: e  reason: collision with root package name */
    private static final String f10410e;

    /* renamed from: f  reason: collision with root package name */
    private static final Set<z2.b> f10411f;

    /* renamed from: g  reason: collision with root package name */
    public static final a f10412g;

    /* renamed from: h  reason: collision with root package name */
    public static final a f10413h;

    /* renamed from: a  reason: collision with root package name */
    private final String f10414a;

    /* renamed from: b  reason: collision with root package name */
    private final String f10415b;

    static {
        String a10 = e.a("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");
        f10408c = a10;
        String a11 = e.a("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
        f10409d = a11;
        String a12 = e.a("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
        f10410e = a12;
        f10411f = Collections.unmodifiableSet(new HashSet(Arrays.asList(z2.b.b("proto"), z2.b.b("json"))));
        f10412g = new a(a10, null);
        f10413h = new a(a11, a12);
    }

    public a(String str, String str2) {
        this.f10414a = str;
        this.f10415b = str2;
    }

    public static a c(byte[] bArr) {
        String str = new String(bArr, Charset.forName("UTF-8"));
        if (str.startsWith("1$")) {
            String[] split = str.substring(2).split(Pattern.quote("\\"), 2);
            if (split.length == 2) {
                String str2 = split[0];
                if (!str2.isEmpty()) {
                    String str3 = split[1];
                    if (str3.isEmpty()) {
                        str3 = null;
                    }
                    return new a(str2, str3);
                }
                throw new IllegalArgumentException("Missing endpoint in CCTDestination extras");
            }
            throw new IllegalArgumentException("Extra is not a valid encoded LegacyFlgDestination");
        }
        throw new IllegalArgumentException("Version marker missing from extras");
    }

    @Override // b3.g
    public Set<z2.b> a() {
        return f10411f;
    }

    public byte[] b() {
        String str = this.f10415b;
        if (str == null && this.f10414a == null) {
            return null;
        }
        Object[] objArr = new Object[4];
        objArr[0] = "1$";
        objArr[1] = this.f10414a;
        objArr[2] = "\\";
        if (str == null) {
            str = "";
        }
        objArr[3] = str;
        return String.format("%s%s%s%s", objArr).getBytes(Charset.forName("UTF-8"));
    }

    public String d() {
        return this.f10415b;
    }

    public String e() {
        return this.f10414a;
    }

    @Override // b3.f
    public byte[] getExtras() {
        return b();
    }

    @Override // b3.f
    public String getName() {
        return "cct";
    }
}
