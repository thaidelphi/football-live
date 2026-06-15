package gatewayprotocol.v1;

import com.google.protobuf.kotlin.DslList;
import com.google.protobuf.kotlin.DslMap;
import com.google.protobuf.kotlin.DslProxy;
import com.google.protobuf.kotlin.ProtoDslMarker;
import gatewayprotocol.v1.ErrorOuterClass;
import gatewayprotocol.v1.InitializationResponseOuterClass;
import gatewayprotocol.v1.NativeConfigurationOuterClass;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.n;
/* compiled from: InitializationResponseKt.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class InitializationResponseKt {
    public static final InitializationResponseKt INSTANCE = new InitializationResponseKt();

    /* compiled from: InitializationResponseKt.kt */
    @ProtoDslMarker
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final InitializationResponseOuterClass.InitializationResponse.Builder _builder;

        /* compiled from: InitializationResponseKt.kt */
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(h hVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(InitializationResponseOuterClass.InitializationResponse.Builder builder) {
                n.f(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        /* compiled from: InitializationResponseKt.kt */
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
        public static final class ScarEligibleFormatsProxy extends DslProxy {
            private ScarEligibleFormatsProxy() {
            }
        }

        /* compiled from: InitializationResponseKt.kt */
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
        public static final class ScarPlacementsProxy extends DslProxy {
            private ScarPlacementsProxy() {
            }
        }

        private Dsl(InitializationResponseOuterClass.InitializationResponse.Builder builder) {
            this._builder = builder;
        }

        public /* synthetic */ Dsl(InitializationResponseOuterClass.InitializationResponse.Builder builder, h hVar) {
            this(builder);
        }

        public final /* synthetic */ InitializationResponseOuterClass.InitializationResponse _build() {
            InitializationResponseOuterClass.InitializationResponse build = this._builder.build();
            n.e(build, "_builder.build()");
            return build;
        }

        public final /* synthetic */ void addAllScarEligibleFormats(DslList dslList, Iterable values) {
            n.f(dslList, "<this>");
            n.f(values, "values");
            this._builder.addAllScarEligibleFormats(values);
        }

        public final /* synthetic */ void addScarEligibleFormats(DslList dslList, InitializationResponseOuterClass.AdFormat value) {
            n.f(dslList, "<this>");
            n.f(value, "value");
            this._builder.addScarEligibleFormats(value);
        }

        public final void clearCountOfLastShownCampaigns() {
            this._builder.clearCountOfLastShownCampaigns();
        }

        public final void clearError() {
            this._builder.clearError();
        }

        public final void clearNativeConfiguration() {
            this._builder.clearNativeConfiguration();
        }

        public final /* synthetic */ void clearScarEligibleFormats(DslList dslList) {
            n.f(dslList, "<this>");
            this._builder.clearScarEligibleFormats();
        }

        public final /* synthetic */ void clearScarPlacements(DslMap dslMap) {
            n.f(dslMap, "<this>");
            this._builder.clearScarPlacements();
        }

        public final void clearTriggerInitializationCompletedRequest() {
            this._builder.clearTriggerInitializationCompletedRequest();
        }

        public final void clearUniversalRequestUrl() {
            this._builder.clearUniversalRequestUrl();
        }

        public final int getCountOfLastShownCampaigns() {
            return this._builder.getCountOfLastShownCampaigns();
        }

        public final ErrorOuterClass.Error getError() {
            ErrorOuterClass.Error error = this._builder.getError();
            n.e(error, "_builder.getError()");
            return error;
        }

        public final ErrorOuterClass.Error getErrorOrNull(Dsl dsl) {
            n.f(dsl, "<this>");
            return InitializationResponseKtKt.getErrorOrNull(dsl._builder);
        }

        public final NativeConfigurationOuterClass.NativeConfiguration getNativeConfiguration() {
            NativeConfigurationOuterClass.NativeConfiguration nativeConfiguration = this._builder.getNativeConfiguration();
            n.e(nativeConfiguration, "_builder.getNativeConfiguration()");
            return nativeConfiguration;
        }

        public final /* synthetic */ DslList getScarEligibleFormats() {
            List<InitializationResponseOuterClass.AdFormat> scarEligibleFormatsList = this._builder.getScarEligibleFormatsList();
            n.e(scarEligibleFormatsList, "_builder.getScarEligibleFormatsList()");
            return new DslList(scarEligibleFormatsList);
        }

        public final /* synthetic */ DslMap getScarPlacementsMap() {
            Map<String, InitializationResponseOuterClass.Placement> scarPlacementsMap = this._builder.getScarPlacementsMap();
            n.e(scarPlacementsMap, "_builder.getScarPlacementsMap()");
            return new DslMap(scarPlacementsMap);
        }

        public final boolean getTriggerInitializationCompletedRequest() {
            return this._builder.getTriggerInitializationCompletedRequest();
        }

        public final String getUniversalRequestUrl() {
            String universalRequestUrl = this._builder.getUniversalRequestUrl();
            n.e(universalRequestUrl, "_builder.getUniversalRequestUrl()");
            return universalRequestUrl;
        }

        public final boolean hasError() {
            return this._builder.hasError();
        }

        public final boolean hasNativeConfiguration() {
            return this._builder.hasNativeConfiguration();
        }

        public final boolean hasUniversalRequestUrl() {
            return this._builder.hasUniversalRequestUrl();
        }

        public final /* synthetic */ void plusAssignAllScarEligibleFormats(DslList<InitializationResponseOuterClass.AdFormat, ScarEligibleFormatsProxy> dslList, Iterable<? extends InitializationResponseOuterClass.AdFormat> values) {
            n.f(dslList, "<this>");
            n.f(values, "values");
            addAllScarEligibleFormats(dslList, values);
        }

        public final /* synthetic */ void plusAssignScarEligibleFormats(DslList<InitializationResponseOuterClass.AdFormat, ScarEligibleFormatsProxy> dslList, InitializationResponseOuterClass.AdFormat value) {
            n.f(dslList, "<this>");
            n.f(value, "value");
            addScarEligibleFormats(dslList, value);
        }

        public final /* synthetic */ void putAllScarPlacements(DslMap dslMap, Map map) {
            n.f(dslMap, "<this>");
            n.f(map, "map");
            this._builder.putAllScarPlacements(map);
        }

        public final void putScarPlacements(DslMap<String, InitializationResponseOuterClass.Placement, ScarPlacementsProxy> dslMap, String key, InitializationResponseOuterClass.Placement value) {
            n.f(dslMap, "<this>");
            n.f(key, "key");
            n.f(value, "value");
            this._builder.putScarPlacements(key, value);
        }

        public final /* synthetic */ void removeScarPlacements(DslMap dslMap, String key) {
            n.f(dslMap, "<this>");
            n.f(key, "key");
            this._builder.removeScarPlacements(key);
        }

        public final void setCountOfLastShownCampaigns(int i10) {
            this._builder.setCountOfLastShownCampaigns(i10);
        }

        public final void setError(ErrorOuterClass.Error value) {
            n.f(value, "value");
            this._builder.setError(value);
        }

        public final void setNativeConfiguration(NativeConfigurationOuterClass.NativeConfiguration value) {
            n.f(value, "value");
            this._builder.setNativeConfiguration(value);
        }

        public final /* synthetic */ void setScarEligibleFormats(DslList dslList, int i10, InitializationResponseOuterClass.AdFormat value) {
            n.f(dslList, "<this>");
            n.f(value, "value");
            this._builder.setScarEligibleFormats(i10, value);
        }

        public final /* synthetic */ void setScarPlacements(DslMap<String, InitializationResponseOuterClass.Placement, ScarPlacementsProxy> dslMap, String key, InitializationResponseOuterClass.Placement value) {
            n.f(dslMap, "<this>");
            n.f(key, "key");
            n.f(value, "value");
            putScarPlacements(dslMap, key, value);
        }

        public final void setTriggerInitializationCompletedRequest(boolean z10) {
            this._builder.setTriggerInitializationCompletedRequest(z10);
        }

        public final void setUniversalRequestUrl(String value) {
            n.f(value, "value");
            this._builder.setUniversalRequestUrl(value);
        }
    }

    private InitializationResponseKt() {
    }
}
