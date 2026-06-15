package com.google.protobuf;

import com.google.protobuf.UInt32Value;
import com.google.protobuf.kotlin.ProtoDslMarker;
/* compiled from: UInt32ValueKt.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class UInt32ValueKt {
    public static final UInt32ValueKt INSTANCE = new UInt32ValueKt();

    /* compiled from: UInt32ValueKt.kt */
    @ProtoDslMarker
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final UInt32Value.Builder _builder;

        /* compiled from: UInt32ValueKt.kt */
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.h hVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(UInt32Value.Builder builder) {
                kotlin.jvm.internal.n.f(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        private Dsl(UInt32Value.Builder builder) {
            this._builder = builder;
        }

        public /* synthetic */ Dsl(UInt32Value.Builder builder, kotlin.jvm.internal.h hVar) {
            this(builder);
        }

        public final /* synthetic */ UInt32Value _build() {
            UInt32Value build = this._builder.build();
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

    private UInt32ValueKt() {
    }
}
