package gatewayprotocol.v1;

import com.google.protobuf.kotlin.DslList;
import com.google.protobuf.kotlin.DslProxy;
import com.google.protobuf.kotlin.ProtoDslMarker;
import gatewayprotocol.v1.CampaignStateOuterClass;
import java.util.List;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.n;
/* compiled from: CampaignStateKt.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class CampaignStateKt {
    public static final CampaignStateKt INSTANCE = new CampaignStateKt();

    /* compiled from: CampaignStateKt.kt */
    @ProtoDslMarker
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final CampaignStateOuterClass.CampaignState.Builder _builder;

        /* compiled from: CampaignStateKt.kt */
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(h hVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(CampaignStateOuterClass.CampaignState.Builder builder) {
                n.f(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        /* compiled from: CampaignStateKt.kt */
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
        public static final class LoadedCampaignsProxy extends DslProxy {
            private LoadedCampaignsProxy() {
            }
        }

        /* compiled from: CampaignStateKt.kt */
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
        public static final class ShownCampaignsProxy extends DslProxy {
            private ShownCampaignsProxy() {
            }
        }

        private Dsl(CampaignStateOuterClass.CampaignState.Builder builder) {
            this._builder = builder;
        }

        public /* synthetic */ Dsl(CampaignStateOuterClass.CampaignState.Builder builder, h hVar) {
            this(builder);
        }

        public final /* synthetic */ CampaignStateOuterClass.CampaignState _build() {
            CampaignStateOuterClass.CampaignState build = this._builder.build();
            n.e(build, "_builder.build()");
            return build;
        }

        public final /* synthetic */ void addAllLoadedCampaigns(DslList dslList, Iterable values) {
            n.f(dslList, "<this>");
            n.f(values, "values");
            this._builder.addAllLoadedCampaigns(values);
        }

        public final /* synthetic */ void addAllShownCampaigns(DslList dslList, Iterable values) {
            n.f(dslList, "<this>");
            n.f(values, "values");
            this._builder.addAllShownCampaigns(values);
        }

        public final /* synthetic */ void addLoadedCampaigns(DslList dslList, CampaignStateOuterClass.Campaign value) {
            n.f(dslList, "<this>");
            n.f(value, "value");
            this._builder.addLoadedCampaigns(value);
        }

        public final /* synthetic */ void addShownCampaigns(DslList dslList, CampaignStateOuterClass.Campaign value) {
            n.f(dslList, "<this>");
            n.f(value, "value");
            this._builder.addShownCampaigns(value);
        }

        public final /* synthetic */ void clearLoadedCampaigns(DslList dslList) {
            n.f(dslList, "<this>");
            this._builder.clearLoadedCampaigns();
        }

        public final /* synthetic */ void clearShownCampaigns(DslList dslList) {
            n.f(dslList, "<this>");
            this._builder.clearShownCampaigns();
        }

        public final /* synthetic */ DslList getLoadedCampaigns() {
            List<CampaignStateOuterClass.Campaign> loadedCampaignsList = this._builder.getLoadedCampaignsList();
            n.e(loadedCampaignsList, "_builder.getLoadedCampaignsList()");
            return new DslList(loadedCampaignsList);
        }

        public final /* synthetic */ DslList getShownCampaigns() {
            List<CampaignStateOuterClass.Campaign> shownCampaignsList = this._builder.getShownCampaignsList();
            n.e(shownCampaignsList, "_builder.getShownCampaignsList()");
            return new DslList(shownCampaignsList);
        }

        public final /* synthetic */ void plusAssignAllLoadedCampaigns(DslList<CampaignStateOuterClass.Campaign, LoadedCampaignsProxy> dslList, Iterable<CampaignStateOuterClass.Campaign> values) {
            n.f(dslList, "<this>");
            n.f(values, "values");
            addAllLoadedCampaigns(dslList, values);
        }

        public final /* synthetic */ void plusAssignAllShownCampaigns(DslList<CampaignStateOuterClass.Campaign, ShownCampaignsProxy> dslList, Iterable<CampaignStateOuterClass.Campaign> values) {
            n.f(dslList, "<this>");
            n.f(values, "values");
            addAllShownCampaigns(dslList, values);
        }

        public final /* synthetic */ void plusAssignLoadedCampaigns(DslList<CampaignStateOuterClass.Campaign, LoadedCampaignsProxy> dslList, CampaignStateOuterClass.Campaign value) {
            n.f(dslList, "<this>");
            n.f(value, "value");
            addLoadedCampaigns(dslList, value);
        }

        public final /* synthetic */ void plusAssignShownCampaigns(DslList<CampaignStateOuterClass.Campaign, ShownCampaignsProxy> dslList, CampaignStateOuterClass.Campaign value) {
            n.f(dslList, "<this>");
            n.f(value, "value");
            addShownCampaigns(dslList, value);
        }

        public final /* synthetic */ void setLoadedCampaigns(DslList dslList, int i10, CampaignStateOuterClass.Campaign value) {
            n.f(dslList, "<this>");
            n.f(value, "value");
            this._builder.setLoadedCampaigns(i10, value);
        }

        public final /* synthetic */ void setShownCampaigns(DslList dslList, int i10, CampaignStateOuterClass.Campaign value) {
            n.f(dslList, "<this>");
            n.f(value, "value");
            this._builder.setShownCampaigns(i10, value);
        }
    }

    private CampaignStateKt() {
    }
}
