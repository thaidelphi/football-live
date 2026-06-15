package com.ironsource;

import android.text.TextUtils;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.Random;
import org.json.JSONException;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class mb {

    /* renamed from: d  reason: collision with root package name */
    public static final int f18462d = 1;

    /* renamed from: e  reason: collision with root package name */
    public static final int f18463e = 2;

    /* renamed from: f  reason: collision with root package name */
    public static final String f18464f = "C38FB23A402222A0C17D34A92F971D1F";

    /* renamed from: g  reason: collision with root package name */
    public static final String f18465g = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQDaUZaiASqhU4+s3JiQaIzVYtC+rZiPX2K+ZRg4C21kBZDNQM5+SEkp5GT5a9W/IR2oz6Q/ucifXcc7QEo5Xl5GX1BAhFI+8KaxPmn5Km5zFdH0aCvrrpDYQpH239Q+2uuUC79G5MpfSIw0zixU4VkF0WbVdHDpgQDds39cPl6cTwIDAQAB";

    /* renamed from: h  reason: collision with root package name */
    public static final String f18466h = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!#$%&'()*+,-./:;<=>?@[\\]^_`{|}~";

    /* renamed from: i  reason: collision with root package name */
    public static final int f18467i = 32;

    /* renamed from: j  reason: collision with root package name */
    private static final mb f18468j = new mb();

    /* renamed from: a  reason: collision with root package name */
    private String f18469a = "";

    /* renamed from: b  reason: collision with root package name */
    private String f18470b = "";

    /* renamed from: c  reason: collision with root package name */
    private String f18471c = "";

    private String a(String str, int i10) {
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        for (int i11 = 0; i11 < i10; i11++) {
            sb.append(str.charAt(random.nextInt(str.length())));
        }
        return sb.toString();
    }

    public static mb b() {
        return f18468j;
    }

    public String a() throws JSONException {
        if (TextUtils.isEmpty(this.f18471c)) {
            try {
                this.f18471c = gk.a(d(), f18465g);
            } catch (Exception e8) {
                o9.d().a(e8);
                String str = "Session key encryption exception: " + e8.getLocalizedMessage();
                IronLog.INTERNAL.error(str);
                throw new JSONException(str);
            }
        }
        return this.f18471c;
    }

    public String c() {
        if (TextUtils.isEmpty(this.f18469a)) {
            this.f18469a = f18464f;
        }
        return this.f18469a;
    }

    public synchronized String d() {
        if (TextUtils.isEmpty(this.f18470b)) {
            this.f18470b = a(f18466h, 32);
        }
        return this.f18470b;
    }
}
