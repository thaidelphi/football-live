package com.google.protobuf;

import com.google.protobuf.DoubleValue;
import com.google.protobuf.kotlin.ProtoDslMarker;
/* compiled from: DoubleValueKt.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class DoubleValueKt {
    public static final DoubleValueKt INSTANCE = new DoubleValueKt();

    /* compiled from: DoubleValueKt.kt */
    @ProtoDslMarker
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final DoubleValue.Builder _builder;

        /* compiled from: DoubleValueKt.kt */
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.h hVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(DoubleValue.Builder builder) {
                kotlin.jvm.internal.n.f(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        private Dsl(DoubleValue.Builder builder) {
            this._builder = builder;
        }

        public /* synthetic */ Dsl(DoubleValue.Builder builder, kotlin.jvm.internal.h hVar) {
            this(builder);
        }

        public final /* synthetic */ DoubleValue _build() {
            DoubleValue build = this._builder.build();
            kotlin.jvm.internal.n.e(build, "_builder.build()");
            return build;
        }

        public final void clearValue() {
            this._builder.clearValue();
        }

        public final double getValue() {
            return this._builder.getValue();
        }

        public final void setValue(double d10) {
            this._builder.setValue(d10);
        }
    }

    private DoubleValueKt() {
    }
}
