package gatewayprotocol.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.kotlin.ProtoDslMarker;
import gatewayprotocol.v1.PiiOuterClass;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.n;
/* compiled from: PiiKt.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class PiiKt {
    public static final PiiKt INSTANCE = new PiiKt();

    /* compiled from: PiiKt.kt */
    @ProtoDslMarker
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final PiiOuterClass.Pii.Builder _builder;

        /* compiled from: PiiKt.kt */
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(h hVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(PiiOuterClass.Pii.Builder builder) {
                n.f(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        private Dsl(PiiOuterClass.Pii.Builder builder) {
            this._builder = builder;
        }

        public /* synthetic */ Dsl(PiiOuterClass.Pii.Builder builder, h hVar) {
            this(builder);
        }

        public final /* synthetic */ PiiOuterClass.Pii _build() {
            PiiOuterClass.Pii build = this._builder.build();
            n.e(build, "_builder.build()");
            return build;
        }

        public final void clearAdvertisingId() {
            this._builder.clearAdvertisingId();
        }

        public final void clearOpenAdvertisingTrackingId() {
            this._builder.clearOpenAdvertisingTrackingId();
        }

        public final void clearVendorId() {
            this._builder.clearVendorId();
        }

        public final ByteString getAdvertisingId() {
            ByteString advertisingId = this._builder.getAdvertisingId();
            n.e(advertisingId, "_builder.getAdvertisingId()");
            return advertisingId;
        }

        public final ByteString getOpenAdvertisingTrackingId() {
            ByteString openAdvertisingTrackingId = this._builder.getOpenAdvertisingTrackingId();
            n.e(openAdvertisingTrackingId, "_builder.getOpenAdvertisingTrackingId()");
            return openAdvertisingTrackingId;
        }

        public final ByteString getVendorId() {
            ByteString vendorId = this._builder.getVendorId();
            n.e(vendorId, "_builder.getVendorId()");
            return vendorId;
        }

        public final void setAdvertisingId(ByteString value) {
            n.f(value, "value");
            this._builder.setAdvertisingId(value);
        }

        public final void setOpenAdvertisingTrackingId(ByteString value) {
            n.f(value, "value");
            this._builder.setOpenAdvertisingTrackingId(value);
        }

        public final void setVendorId(ByteString value) {
            n.f(value, "value");
            this._builder.setVendorId(value);
        }
    }

    private PiiKt() {
    }
}
