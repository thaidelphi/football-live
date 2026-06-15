package com.google.protobuf;

import com.google.protobuf.BytesValue;
import com.google.protobuf.kotlin.ProtoDslMarker;
/* compiled from: BytesValueKt.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class BytesValueKt {
    public static final BytesValueKt INSTANCE = new BytesValueKt();

    /* compiled from: BytesValueKt.kt */
    @ProtoDslMarker
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final BytesValue.Builder _builder;

        /* compiled from: BytesValueKt.kt */
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.h hVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(BytesValue.Builder builder) {
                kotlin.jvm.internal.n.f(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        private Dsl(BytesValue.Builder builder) {
            this._builder = builder;
        }

        public /* synthetic */ Dsl(BytesValue.Builder builder, kotlin.jvm.internal.h hVar) {
            this(builder);
        }

        public final /* synthetic */ BytesValue _build() {
            BytesValue build = this._builder.build();
            kotlin.jvm.internal.n.e(build, "_builder.build()");
            return build;
        }

        public final void clearValue() {
            this._builder.clearValue();
        }

        public final ByteString getValue() {
            ByteString value = this._builder.getValue();
            kotlin.jvm.internal.n.e(value, "_builder.getValue()");
            return value;
        }

        public final void setValue(ByteString value) {
            kotlin.jvm.internal.n.f(value, "value");
            this._builder.setValue(value);
        }
    }

    private BytesValueKt() {
    }
}
