package com.google.protobuf;

import com.google.protobuf.Int64Value;
import com.google.protobuf.kotlin.ProtoDslMarker;
/* compiled from: Int64ValueKt.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class Int64ValueKt {
    public static final Int64ValueKt INSTANCE = new Int64ValueKt();

    /* compiled from: Int64ValueKt.kt */
    @ProtoDslMarker
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final Int64Value.Builder _builder;

        /* compiled from: Int64ValueKt.kt */
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.h hVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(Int64Value.Builder builder) {
                kotlin.jvm.internal.n.f(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        private Dsl(Int64Value.Builder builder) {
            this._builder = builder;
        }

        public /* synthetic */ Dsl(Int64Value.Builder builder, kotlin.jvm.internal.h hVar) {
            this(builder);
        }

        public final /* synthetic */ Int64Value _build() {
            Int64Value build = this._builder.build();
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

    private Int64ValueKt() {
    }
}
