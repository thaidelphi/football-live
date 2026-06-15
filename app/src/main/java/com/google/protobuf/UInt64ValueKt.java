package com.google.protobuf;

import com.google.protobuf.UInt64Value;
import com.google.protobuf.kotlin.ProtoDslMarker;
/* compiled from: UInt64ValueKt.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class UInt64ValueKt {
    public static final UInt64ValueKt INSTANCE = new UInt64ValueKt();

    /* compiled from: UInt64ValueKt.kt */
    @ProtoDslMarker
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final UInt64Value.Builder _builder;

        /* compiled from: UInt64ValueKt.kt */
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.h hVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(UInt64Value.Builder builder) {
                kotlin.jvm.internal.n.f(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        private Dsl(UInt64Value.Builder builder) {
            this._builder = builder;
        }

        public /* synthetic */ Dsl(UInt64Value.Builder builder, kotlin.jvm.internal.h hVar) {
            this(builder);
        }

        public final /* synthetic */ UInt64Value _build() {
            UInt64Value build = this._builder.build();
            kotlin.jvm.internal.n.e(build, "_builder.build()");
            return build;
        }

        public final void clearValue() {
            this._builder.clearValue();
        }

        public final long getValue() {
            return this._builder.getValue();
        }

        public final void setValue(long j10) {
            this._builder.setValue(j10);
        }
    }

    private UInt64ValueKt() {
    }
}
