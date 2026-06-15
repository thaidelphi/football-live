package com.ironsource;

import android.util.Pair;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sf;
import java.util.ArrayList;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class jc implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    private static final String f17946e = "Content-Type";

    /* renamed from: f  reason: collision with root package name */
    private static final String f17947f = "application/json";

    /* renamed from: a  reason: collision with root package name */
    private sf f17948a;

    /* renamed from: b  reason: collision with root package name */
    String f17949b;

    /* renamed from: c  reason: collision with root package name */
    String f17950c;

    /* renamed from: d  reason: collision with root package name */
    ArrayList<zb> f17951d;

    public jc(sf sfVar, String str, String str2, ArrayList<zb> arrayList) {
        this.f17948a = sfVar;
        this.f17949b = str;
        this.f17950c = str2;
        this.f17951d = arrayList;
    }

    @Override // java.lang.Runnable
    public void run() {
        sf.a a10;
        sf.a aVar = new sf.a(this.f17951d);
        try {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new Pair("Content-Type", "application/json"));
            fq b10 = rg.b(this.f17950c, this.f17949b, arrayList);
            a10 = aVar.a(b10.a()).a(b10.f17495a);
        } catch (Exception e8) {
            o9.d().a(e8);
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.error("EventsSender failed to send events - " + e8.getLocalizedMessage());
            a10 = aVar.a(e8 instanceof go).a(e8);
        }
        sf sfVar = this.f17948a;
        if (sfVar != null) {
            sfVar.a(a10);
        }
    }
}
