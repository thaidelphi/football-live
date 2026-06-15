package com.unity3d.ads.core.data.repository;

import com.google.protobuf.ByteString;
import com.unity3d.ads.core.domain.GetSharedDataTimestamps;
import g9.l0;
import g9.w;
import gatewayprotocol.v1.CampaignKt;
import gatewayprotocol.v1.CampaignStateKt;
import gatewayprotocol.v1.CampaignStateOuterClass;
import i8.s;
import j8.j0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.n;
/* compiled from: AndroidCampaignRepository.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class AndroidCampaignRepository implements CampaignRepository {
    private final w<Map<String, CampaignStateOuterClass.Campaign>> campaigns;
    private final GetSharedDataTimestamps getSharedDataTimestamps;

    public AndroidCampaignRepository(GetSharedDataTimestamps getSharedDataTimestamps) {
        Map f10;
        n.f(getSharedDataTimestamps, "getSharedDataTimestamps");
        this.getSharedDataTimestamps = getSharedDataTimestamps;
        f10 = j0.f();
        this.campaigns = l0.a(f10);
    }

    @Override // com.unity3d.ads.core.data.repository.CampaignRepository
    public CampaignStateOuterClass.Campaign getCampaign(ByteString opportunityId) {
        n.f(opportunityId, "opportunityId");
        return this.campaigns.getValue().get(opportunityId.toStringUtf8());
    }

    @Override // com.unity3d.ads.core.data.repository.CampaignRepository
    public CampaignStateOuterClass.CampaignState getCampaignState() {
        Collection<CampaignStateOuterClass.Campaign> values = this.campaigns.getValue().values();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : values) {
            if (((CampaignStateOuterClass.Campaign) obj).hasShowTimestamp()) {
                arrayList.add(obj);
            } else {
                arrayList2.add(obj);
            }
        }
        i8.n nVar = new i8.n(arrayList, arrayList2);
        CampaignStateKt.Dsl.Companion companion = CampaignStateKt.Dsl.Companion;
        CampaignStateOuterClass.CampaignState.Builder newBuilder = CampaignStateOuterClass.CampaignState.newBuilder();
        n.e(newBuilder, "newBuilder()");
        CampaignStateKt.Dsl _create = companion._create(newBuilder);
        _create.addAllShownCampaigns(_create.getShownCampaigns(), (List) nVar.a());
        _create.addAllLoadedCampaigns(_create.getLoadedCampaigns(), (List) nVar.b());
        return _create._build();
    }

    @Override // com.unity3d.ads.core.data.repository.CampaignRepository
    public void removeState(ByteString opportunityId) {
        Map<String, CampaignStateOuterClass.Campaign> value;
        Map<String, CampaignStateOuterClass.Campaign> h10;
        n.f(opportunityId, "opportunityId");
        w<Map<String, CampaignStateOuterClass.Campaign>> wVar = this.campaigns;
        do {
            value = wVar.getValue();
            String stringUtf8 = opportunityId.toStringUtf8();
            n.e(stringUtf8, "opportunityId.toStringUtf8()");
            h10 = j0.h(value, stringUtf8);
        } while (!wVar.i(value, h10));
    }

    @Override // com.unity3d.ads.core.data.repository.CampaignRepository
    public void setCampaign(ByteString opportunityId, CampaignStateOuterClass.Campaign campaign) {
        Map<String, CampaignStateOuterClass.Campaign> value;
        Map<String, CampaignStateOuterClass.Campaign> k10;
        n.f(opportunityId, "opportunityId");
        n.f(campaign, "campaign");
        w<Map<String, CampaignStateOuterClass.Campaign>> wVar = this.campaigns;
        do {
            value = wVar.getValue();
            k10 = j0.k(value, s.a(opportunityId.toStringUtf8(), campaign));
        } while (!wVar.i(value, k10));
    }

    @Override // com.unity3d.ads.core.data.repository.CampaignRepository
    public void setLoadTimestamp(ByteString opportunityId) {
        n.f(opportunityId, "opportunityId");
        CampaignStateOuterClass.Campaign campaign = getCampaign(opportunityId);
        if (campaign != null) {
            CampaignKt.Dsl.Companion companion = CampaignKt.Dsl.Companion;
            CampaignStateOuterClass.Campaign.Builder builder = campaign.toBuilder();
            n.e(builder, "this.toBuilder()");
            CampaignKt.Dsl _create = companion._create(builder);
            _create.setLoadTimestamp(this.getSharedDataTimestamps.invoke());
            i8.w wVar = i8.w.f26638a;
            setCampaign(opportunityId, _create._build());
        }
    }

    @Override // com.unity3d.ads.core.data.repository.CampaignRepository
    public void setShowTimestamp(ByteString opportunityId) {
        n.f(opportunityId, "opportunityId");
        CampaignStateOuterClass.Campaign campaign = getCampaign(opportunityId);
        if (campaign != null) {
            CampaignKt.Dsl.Companion companion = CampaignKt.Dsl.Companion;
            CampaignStateOuterClass.Campaign.Builder builder = campaign.toBuilder();
            n.e(builder, "this.toBuilder()");
            CampaignKt.Dsl _create = companion._create(builder);
            _create.setShowTimestamp(this.getSharedDataTimestamps.invoke());
            i8.w wVar = i8.w.f26638a;
            setCampaign(opportunityId, _create._build());
        }
    }
}
