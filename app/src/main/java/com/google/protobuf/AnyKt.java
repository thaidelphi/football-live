package com.google.protobuf;

import com.google.protobuf.Any;
import com.google.protobuf.kotlin.ProtoDslMarker;
/* compiled from: AnyKt.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class AnyKt {
    public static final AnyKt INSTANCE = new AnyKt();

    /* compiled from: AnyKt.kt */
    @ProtoDslMarker
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final Any.Builder _builder;

        /* compiled from: AnyKt.kt */
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.h hVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(Any.Builder builder) {
                kotlin.jvm.internal.n.f(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        private Dsl(Any.Builder builder) {
            this._builder = builder;
        }

        public /* synthetic */ Dsl(Any.Builder builder, kotlin.jvm.internal.h hVar) {
            this(builder);
        }

        public final /* synthetic */ Any _build() {
            Any build = this._builder.build();
            kotlin.jvm.internal.n.e(build, "_builder.build()");
            return build;
        }

        public final void clearTypeUrl() {
            this._builder.clearTypeUrl();
        }

        public final void clearValue() {
            this._builder.clearValue();
        }

        public final String getTypeUrl() {
            String typeUrl = this._builder.getTypeUrl();
            kotlin.jvm.internal.n.e(typeUrl, "_builder.getTypeUrl()");
            return typeUrl;
        }

        public final ByteString getValue() {
            ByteString value = this._builder.getValue();
            kotlin.jvm.internal.n.e(value, "_builder.getValue()");
            return value;
        }

        public final void setTypeUrl(String value) {
            kotlin.jvm.internal.n.f(value, "value");
            this._builder.setTypeUrl(value);
        }

        public final void setValue(ByteString value) {
            kotlin.jvm.internal.n.f(value, "value");
            this._builder.setValue(value);
        }
    }

    private AnyKt() {
    }
}
