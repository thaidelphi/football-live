package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.internal.IAccountAccessor;
import java.util.ArrayList;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class l extends p {

    /* renamed from: b  reason: collision with root package name */
    private final ArrayList<Api.Client> f12226b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ zaaw f12227c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(zaaw zaawVar, ArrayList<Api.Client> arrayList) {
        super(zaawVar, null);
        this.f12227c = zaawVar;
        this.f12226b = arrayList;
    }

    @Override // com.google.android.gms.common.api.internal.p
    public final void b() {
        zabi zabiVar;
        IAccountAccessor iAccountAccessor;
        zabi zabiVar2;
        zaaw zaawVar = this.f12227c;
        zabiVar = zaawVar.f12268a;
        zabiVar.f12323n.f12301m = zaaw.x(zaawVar);
        ArrayList<Api.Client> arrayList = this.f12226b;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            zaaw zaawVar2 = this.f12227c;
            iAccountAccessor = zaawVar2.f12282o;
            zabiVar2 = zaawVar2.f12268a;
            arrayList.get(i10).getRemoteService(iAccountAccessor, zabiVar2.f12323n.f12301m);
        }
    }
}
