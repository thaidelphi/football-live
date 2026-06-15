package com.adcolony.sdk;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class m implements j0 {

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f6122a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f6123b;

        a(m mVar, String str, String str2) {
            this.f6122a = str;
            this.f6123b = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                AdColonyCustomMessageListener adColonyCustomMessageListener = com.adcolony.sdk.a.b().m().get(this.f6122a);
                if (adColonyCustomMessageListener != null) {
                    adColonyCustomMessageListener.onAdColonyCustomMessage(new AdColonyCustomMessage(this.f6122a, this.f6123b));
                }
            } catch (RuntimeException unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public m() {
        com.adcolony.sdk.a.a("CustomMessage.controller_send", this);
    }

    @Override // com.adcolony.sdk.j0
    public void a(h0 h0Var) {
        f1 a10 = h0Var.a();
        z0.b(new a(this, c0.h(a10, "type"), c0.h(a10, "message")));
    }
}
