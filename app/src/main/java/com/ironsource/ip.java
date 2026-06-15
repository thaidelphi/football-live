package com.ironsource;

import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.ArrayList;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class ip extends s7 {
    public static final ip P;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static final class a {
        public final void a() {
            new ak().b(ContextProvider.getInstance().getApplicationContext());
            ip.P.a(new zb(IronSourceConstants.INIT_DEFERRED_DATA, new ni().a()));
        }
    }

    static {
        ip ipVar = new ip();
        P = ipVar;
        ipVar.H = "outcome";
        ipVar.G = 0;
        ipVar.I = IronSourceConstants.PIXEL_EVENT_TYPE;
        ipVar.e();
    }

    private ip() {
    }

    @Override // com.ironsource.s7
    protected void a(ArrayList<zb> arrayList) {
    }

    @Override // com.ironsource.s7
    protected int c(zb zbVar) {
        return 1;
    }

    @Override // com.ironsource.s7
    protected void d() {
    }

    @Override // com.ironsource.s7
    protected boolean d(zb zbVar) {
        return true;
    }

    @Override // com.ironsource.s7
    protected String e(int i10) {
        return "";
    }

    @Override // com.ironsource.s7
    protected void f(zb zbVar) {
    }

    @Override // com.ironsource.s7
    protected boolean g(zb zbVar) {
        return false;
    }

    @Override // com.ironsource.s7
    protected boolean h(zb zbVar) {
        return false;
    }

    @Override // com.ironsource.s7
    protected boolean j(zb zbVar) {
        return false;
    }
}
