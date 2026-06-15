package gatewayprotocol.v1;

import com.google.protobuf.kotlin.ProtoDslMarker;
import gatewayprotocol.v1.TestDataOuterClass;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.n;
/* compiled from: TestDataKt.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class TestDataKt {
    public static final TestDataKt INSTANCE = new TestDataKt();

    /* compiled from: TestDataKt.kt */
    @ProtoDslMarker
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final TestDataOuterClass.TestData.Builder _builder;

        /* compiled from: TestDataKt.kt */
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(h hVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(TestDataOuterClass.TestData.Builder builder) {
                n.f(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        private Dsl(TestDataOuterClass.TestData.Builder builder) {
            this._builder = builder;
        }

        public /* synthetic */ Dsl(TestDataOuterClass.TestData.Builder builder, h hVar) {
            this(builder);
        }

        public final /* synthetic */ TestDataOuterClass.TestData _build() {
            TestDataOuterClass.TestData build = this._builder.build();
            n.e(build, "_builder.build()");
            return build;
        }

        public final void clearForceCampaignId() {
            this._builder.clearForceCampaignId();
        }

        public final void clearForceCountry() {
            this._builder.clearForceCountry();
        }

        public final void clearForceCountrySubdivision() {
            this._builder.clearForceCountrySubdivision();
        }

        public final void clearForceExchangeTestMode() {
            this._builder.clearForceExchangeTestMode();
        }

        public final String getForceCampaignId() {
            String forceCampaignId = this._builder.getForceCampaignId();
            n.e(forceCampaignId, "_builder.getForceCampaignId()");
            return forceCampaignId;
        }

        public final String getForceCountry() {
            String forceCountry = this._builder.getForceCountry();
            n.e(forceCountry, "_builder.getForceCountry()");
            return forceCountry;
        }

        public final String getForceCountrySubdivision() {
            String forceCountrySubdivision = this._builder.getForceCountrySubdivision();
            n.e(forceCountrySubdivision, "_builder.getForceCountrySubdivision()");
            return forceCountrySubdivision;
        }

        public final int getForceExchangeTestMode() {
            return this._builder.getForceExchangeTestMode();
        }

        public final boolean hasForceCampaignId() {
            return this._builder.hasForceCampaignId();
        }

        public final boolean hasForceCountry() {
            return this._builder.hasForceCountry();
        }

        public final boolean hasForceCountrySubdivision() {
            return this._builder.hasForceCountrySubdivision();
        }

        public final boolean hasForceExchangeTestMode() {
            return this._builder.hasForceExchangeTestMode();
        }

        public final void setForceCampaignId(String value) {
            n.f(value, "value");
            this._builder.setForceCampaignId(value);
        }

        public final void setForceCountry(String value) {
            n.f(value, "value");
            this._builder.setForceCountry(value);
        }

        public final void setForceCountrySubdivision(String value) {
            n.f(value, "value");
            this._builder.setForceCountrySubdivision(value);
        }

        public final void setForceExchangeTestMode(int i10) {
            this._builder.setForceExchangeTestMode(i10);
        }
    }

    private TestDataKt() {
    }
}
