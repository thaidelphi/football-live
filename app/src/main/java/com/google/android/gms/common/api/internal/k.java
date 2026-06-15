package com.google.android.gms.common.api.internal;

import android.content.Context;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.api.Api;
import java.util.ArrayList;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class k extends p {

    /* renamed from: b  reason: collision with root package name */
    private final Map<Api.Client, h> f12220b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ zaaw f12221c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(zaaw zaawVar, Map<Api.Client, h> map) {
        super(zaawVar, null);
        this.f12221c = zaawVar;
        this.f12220b = map;
    }

    @Override // com.google.android.gms.common.api.internal.p
    public final void b() {
        GoogleApiAvailabilityLight googleApiAvailabilityLight;
        Context context;
        boolean z10;
        Context context2;
        zabi zabiVar;
        com.google.android.gms.signin.zae zaeVar;
        com.google.android.gms.signin.zae zaeVar2;
        zabi zabiVar2;
        Context context3;
        boolean z11;
        googleApiAvailabilityLight = this.f12221c.f12271d;
        com.google.android.gms.common.internal.zal zalVar = new com.google.android.gms.common.internal.zal(googleApiAvailabilityLight);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Api.Client client : this.f12220b.keySet()) {
            if (client.requiresGooglePlayServices()) {
                z11 = this.f12220b.get(client).f12214c;
                if (!z11) {
                    arrayList.add(client);
                }
            }
            arrayList2.add(client);
        }
        int i10 = -1;
        int i11 = 0;
        if (arrayList.isEmpty()) {
            int size = arrayList2.size();
            while (i11 < size) {
                context3 = this.f12221c.f12270c;
                i10 = zalVar.b(context3, (Api.Client) arrayList2.get(i11));
                i11++;
                if (i10 == 0) {
                    break;
                }
            }
        } else {
            int size2 = arrayList.size();
            while (i11 < size2) {
                context = this.f12221c.f12270c;
                i10 = zalVar.b(context, (Api.Client) arrayList.get(i11));
                i11++;
                if (i10 != 0) {
                    break;
                }
            }
        }
        if (i10 != 0) {
            ConnectionResult connectionResult = new ConnectionResult(i10, null);
            zaaw zaawVar = this.f12221c;
            zabiVar2 = zaawVar.f12268a;
            zabiVar2.k(new i(this, zaawVar, connectionResult));
            return;
        }
        zaaw zaawVar2 = this.f12221c;
        z10 = zaawVar2.f12280m;
        if (z10) {
            zaeVar = zaawVar2.f12278k;
            if (zaeVar != null) {
                zaeVar2 = zaawVar2.f12278k;
                zaeVar2.b();
            }
        }
        for (Api.Client client2 : this.f12220b.keySet()) {
            h hVar = this.f12220b.get(client2);
            if (client2.requiresGooglePlayServices()) {
                context2 = this.f12221c.f12270c;
                if (zalVar.b(context2, client2) != 0) {
                    zaaw zaawVar3 = this.f12221c;
                    zabiVar = zaawVar3.f12268a;
                    zabiVar.k(new j(this, zaawVar3, hVar));
                }
            }
            client2.connect(hVar);
        }
    }
}
