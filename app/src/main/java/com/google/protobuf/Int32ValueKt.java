package com.google.protobuf;

import com.google.protobuf.Int32Value;
import com.google.protobuf.kotlin.ProtoDslMarker;
/* compiled from: Int32ValueKt.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class Int32ValueKt {
    public static final Int32ValueKt INSTANCE = new Int32ValueKt();

    /* compiled from: Int32ValueKt.kt */
    @ProtoDslMarker
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final Int32Value.Builder _builder;

        /* compiled from: Int32ValueKt.kt */
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.h hVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(Int32Value.Builder builder) {
                kotlin.jvm.internal.n.f(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        private Dsl(Int32Value.Builder builder) {
            this._builder = builder;
        }

        public /* synthetic */ Dsl(Int32Value.Builder builder, kotlin.jvm.internal.h hVar) {
            this(builder);
        }

        public final /* synthetic */ Int32Value _build() {
            Int32Value build = this._builder.build();
            kotlin.jvm.internal.n.e(build, "_builder.build()");
            return build;
        }

        public final void clearValue() {
            this._builder.clearValue();
        }

        public final int getValue() {
            return this._builder.getValue();
        }

        public final void setValue(int i10) {
            this._builder.setValue(i10);
        }
    }

    private Int32ValueKt() {
    }
}
