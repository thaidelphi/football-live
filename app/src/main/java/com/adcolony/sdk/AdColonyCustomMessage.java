package com.adcolony.sdk;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class AdColonyCustomMessage {

    /* renamed from: a  reason: collision with root package name */
    private String f5692a;

    /* renamed from: b  reason: collision with root package name */
    private String f5693b;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AdColony.b();
            f1 b10 = c0.b();
            c0.a(b10, "type", AdColonyCustomMessage.this.f5692a);
            c0.a(b10, "message", AdColonyCustomMessage.this.f5693b);
            new h0("CustomMessage.native_send", 1, b10).c();
        }
    }

    public AdColonyCustomMessage(String str, String str2) {
        if (z0.e(str) || z0.e(str2)) {
            this.f5692a = str;
            this.f5693b = str2;
        }
    }

    public String getMessage() {
        return this.f5693b;
    }

    public String getType() {
        return this.f5692a;
    }

    public void send() {
        AdColony.a(new a());
    }

    public AdColonyCustomMessage set(String str, String str2) {
        this.f5692a = str;
        this.f5693b = str2;
        return this;
    }
}
