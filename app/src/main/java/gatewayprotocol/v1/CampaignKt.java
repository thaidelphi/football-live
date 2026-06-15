package gatewayprotocol.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.kotlin.ProtoDslMarker;
import gatewayprotocol.v1.CampaignStateOuterClass;
import gatewayprotocol.v1.TimestampsOuterClass;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.n;
/* compiled from: CampaignKt.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class CampaignKt {
    public static final CampaignKt INSTANCE = new CampaignKt();

    /* compiled from: CampaignKt.kt */
    @ProtoDslMarker
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final CampaignStateOuterClass.Campaign.Builder _builder;

        /* compiled from: CampaignKt.kt */
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(h hVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(CampaignStateOuterClass.Campaign.Builder builder) {
                n.f(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        private Dsl(CampaignStateOuterClass.Campaign.Builder builder) {
            this._builder = builder;
        }

        public /* synthetic */ Dsl(CampaignStateOuterClass.Campaign.Builder builder, h hVar) {
            this(builder);
        }

        public final /* synthetic */ CampaignStateOuterClass.Campaign _build() {
            CampaignStateOuterClass.Campaign build = this._builder.build();
            n.e(build, "_builder.build()");
            return build;
        }

        public final void clearData() {
            this._builder.clearData();
        }

        public final void clearDataVersion() {
            this._builder.clearDataVersion();
        }

        public final void clearImpressionOpportunityId() {
            this._builder.clearImpressionOpportunityId();
        }

        public final void clearLoadTimestamp() {
            this._builder.clearLoadTimestamp();
        }

        public final void clearPlacementId() {
            this._builder.clearPlacementId();
        }

        public final void clearShowTimestamp() {
            this._builder.clearShowTimestamp();
        }

        public final ByteString getData() {
            ByteString data = this._builder.getData();
            n.e(data, "_builder.getData()");
            return data;
        }

        public final int getDataVersion() {
            return this._builder.getDataVersion();
        }

        public final ByteString getImpressionOpportunityId() {
            ByteString impressionOpportunityId = this._builder.getImpressionOpportunityId();
            n.e(impressionOpportunityId, "_builder.getImpressionOpportunityId()");
            return impressionOpportunityId;
        }

        public final TimestampsOuterClass.Timestamps getLoadTimestamp() {
            TimestampsOuterClass.Timestamps loadTimestamp = this._builder.getLoadTimestamp();
            n.e(loadTimestamp, "_builder.getLoadTimestamp()");
            return loadTimestamp;
        }

        public final String getPlacementId() {
            String placementId = this._builder.getPlacementId();
            n.e(placementId, "_builder.getPlacementId()");
            return placementId;
        }

        public final TimestampsOuterClass.Timestamps getShowTimestamp() {
            TimestampsOuterClass.Timestamps showTimestamp = this._builder.getShowTimestamp();
            n.e(showTimestamp, "_builder.getShowTimestamp()");
            return showTimestamp;
        }

        public final TimestampsOuterClass.Timestamps getShowTimestampOrNull(Dsl dsl) {
            n.f(dsl, "<this>");
            return CampaignKtKt.getShowTimestampOrNull(dsl._builder);
        }

        public final boolean hasLoadTimestamp() {
            return this._builder.hasLoadTimestamp();
        }

        public final boolean hasShowTimestamp() {
            return this._builder.hasShowTimestamp();
        }

        public final void setData(ByteString value) {
            n.f(value, "value");
            this._builder.setData(value);
        }

        public final void setDataVersion(int i10) {
            this._builder.setDataVersion(i10);
        }

        public final void setImpressionOpportunityId(ByteString value) {
            n.f(value, "value");
            this._builder.setImpressionOpportunityId(value);
        }

        public final void setLoadTimestamp(TimestampsOuterClass.Timestamps value) {
            n.f(value, "value");
            this._builder.setLoadTimestamp(value);
        }

        public final void setPlacementId(String value) {
            n.f(value, "value");
            this._builder.setPlacementId(value);
        }

        public final void setShowTimestamp(TimestampsOuterClass.Timestamps value) {
            n.f(value, "value");
            this._builder.setShowTimestamp(value);
        }
    }

    private CampaignKt() {
    }
}
