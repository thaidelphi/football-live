package com.google.protobuf;

import com.google.protobuf.FloatValue;
import com.google.protobuf.kotlin.ProtoDslMarker;
/* compiled from: FloatValueKt.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class FloatValueKt {
    public static final FloatValueKt INSTANCE = new FloatValueKt();

    /* compiled from: FloatValueKt.kt */
    @ProtoDslMarker
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final FloatValue.Builder _builder;

        /* compiled from: FloatValueKt.kt */
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.h hVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(FloatValue.Builder builder) {
                kotlin.jvm.internal.n.f(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        private Dsl(FloatValue.Builder builder) {
            this._builder = builder;
        }

        public /* synthetic */ Dsl(FloatValue.Builder builder, kotlin.jvm.internal.h hVar) {
            this(builder);
        }

        public final /* synthetic */ FloatValue _build() {
            FloatValue build = this._builder.build();
            kotlin.jvm.internal.n.e(build, "_builder.build()");
            return build;
        }

        public final void clearValue() {
            this._builder.clearValue();
        }

        public final float getValue() {
            return this._builder.getValue();
        }

        public final void setValue(float f10) {
            this._builder.setValue(f10);
        }
    }

    private FloatValueKt() {
    }
}
