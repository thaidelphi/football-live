package com.ironsource;

import android.text.TextUtils;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.IronSourceSegment;
import com.ironsource.mediationsdk.ads.nativead.internal.InternalNativeAdListener;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.model.Placement;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.n7;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class an extends n7<en, AdapterAdListener> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public an(List<? extends NetworkSettings> list, rm configs, String str, qk publisherDataHolder, IronSourceSegment ironSourceSegment) {
        super(new bn(str, list, configs), publisherDataHolder, ironSourceSegment);
        kotlin.jvm.internal.n.f(configs, "configs");
        kotlin.jvm.internal.n.f(publisherDataHolder, "publisherDataHolder");
    }

    @Override // com.ironsource.n7
    protected void G() {
    }

    @Override // com.ironsource.n7
    protected boolean H() {
        return false;
    }

    public final void M() {
        fv fvVar;
        int intValue;
        zl zlVar;
        IronLog.INTERNAL.verbose();
        try {
            en enVar = (en) this.f19346a.d();
            if (enVar != null) {
                Integer r10 = enVar.r();
                if (r10 == null) {
                    intValue = this.C.a(this.f19360o.b());
                } else {
                    kotlin.jvm.internal.n.e(r10, "it.sessionDepth ?: sessi…epth(mManagerData.adUnit)");
                    intValue = r10.intValue();
                }
                e2 e2Var = this.f19364s;
                if (e2Var != null && (zlVar = e2Var.f17167g) != null) {
                    zlVar.a(intValue);
                }
                enVar.P();
                this.f19346a.a(null);
                this.f19346a.b(null);
            }
            this.f19354i = null;
            a(n7.f.NONE);
        } catch (Throwable th) {
            o9.d().a(th);
            String str = "destroyNativeAd - exception = " + th.getLocalizedMessage();
            IronLog.INTERNAL.error(b(str));
            e2 e2Var2 = this.f19364s;
            if (e2Var2 == null || (fvVar = e2Var2.f17171k) == null) {
                return;
            }
            fvVar.g(str);
        }
    }

    @Override // com.ironsource.n7, com.ironsource.d2
    public Map<String, Object> a(b2 event) {
        kotlin.jvm.internal.n.f(event, "event");
        Map<String, Object> data = super.a(event);
        Placement placement = this.f19354i;
        if (placement != null) {
            kotlin.jvm.internal.n.e(data, "data");
            data.put("placement", placement.getPlacementName());
        }
        UUID uuid = this.f19368w;
        if (uuid != null) {
            kotlin.jvm.internal.n.e(data, "data");
            data.put("objectId", uuid);
        }
        kotlin.jvm.internal.n.e(data, "data");
        return data;
    }

    public final void a(InternalNativeAdListener nativeAdListener) {
        kotlin.jvm.internal.n.f(nativeAdListener, "nativeAdListener");
        a(new zm(nativeAdListener));
    }

    @Override // com.ironsource.n7
    protected void a(IronSourceError ironSourceError) {
        this.f19365t.a(ironSourceError);
    }

    public final void a(Placement placement) {
        String format;
        int b10;
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("placement = " + placement);
        if (placement == null || TextUtils.isEmpty(placement.getPlacementName())) {
            kotlin.jvm.internal.d0 d0Var = kotlin.jvm.internal.d0.f27370a;
            Object[] objArr = new Object[1];
            objArr[0] = placement == null ? "placement is null" : "placement name is empty";
            format = String.format("can't load native ad - %s", Arrays.copyOf(objArr, 1));
            kotlin.jvm.internal.n.e(format, "format(format, *args)");
            b10 = a2.b(this.f19360o.b());
        } else if (this.E.b(ContextProvider.getInstance().getApplicationContext(), placement, this.f19360o.b())) {
            kotlin.jvm.internal.d0 d0Var2 = kotlin.jvm.internal.d0.f27370a;
            format = String.format("placement %s is capped", Arrays.copyOf(new Object[]{placement.getPlacementName()}, 1));
            kotlin.jvm.internal.n.e(format, "format(format, *args)");
            b10 = a2.f(this.f19360o.b());
        } else {
            format = null;
            b10 = 510;
        }
        if (TextUtils.isEmpty(format)) {
            this.f19354i = placement;
            A();
            return;
        }
        IronLog.API.error(b(format));
        a(b10, format, false);
    }

    @Override // com.ironsource.n7
    protected void a(q7<?> q7Var, AdInfo adInfo) {
        if (q7Var instanceof en) {
            en enVar = (en) q7Var;
            this.f19365t.a(enVar.Q(), enVar.R(), adInfo);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.ironsource.n7
    /* renamed from: b */
    public en a(NetworkSettings providerSettings, BaseAdAdapter<?, AdapterAdListener> adapter, int i10, String currentAuctionId, m5 item) {
        kotlin.jvm.internal.n.f(providerSettings, "providerSettings");
        kotlin.jvm.internal.n.f(adapter, "adapter");
        kotlin.jvm.internal.n.f(currentAuctionId, "currentAuctionId");
        kotlin.jvm.internal.n.f(item, "item");
        return new en(this, new m1(IronSource.AD_UNIT.NATIVE_AD, this.f19360o.o(), i10, this.f19352g, currentAuctionId, this.f19350e, this.f19351f, providerSettings, this.f19360o.n()), adapter, this.f19354i, item, this);
    }

    @Override // com.ironsource.n7
    protected JSONObject b(NetworkSettings providerSettings) {
        kotlin.jvm.internal.n.f(providerSettings, "providerSettings");
        JSONObject nativeAdSettings = providerSettings.getNativeAdSettings();
        kotlin.jvm.internal.n.e(nativeAdSettings, "providerSettings.nativeAdSettings");
        return nativeAdSettings;
    }

    @Override // com.ironsource.n7
    protected l2 g() {
        return new jb();
    }

    @Override // com.ironsource.n7
    protected String l() {
        return "NA";
    }

    @Override // com.ironsource.n7
    protected String o() {
        return IronSourceConstants.OPW_NT_MANAGER_NAME;
    }

    @Override // com.ironsource.n7
    protected boolean v() {
        return false;
    }
}
