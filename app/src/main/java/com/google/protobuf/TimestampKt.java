package com.google.protobuf;

import com.google.protobuf.Timestamp;
import com.google.protobuf.kotlin.ProtoDslMarker;
/* compiled from: TimestampKt.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class TimestampKt {
    public static final TimestampKt INSTANCE = new TimestampKt();

    /* compiled from: TimestampKt.kt */
    @ProtoDslMarker
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final Timestamp.Builder _builder;

        /* compiled from: TimestampKt.kt */
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.h hVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(Timestamp.Builder builder) {
                kotlin.jvm.internal.n.f(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        private Dsl(Timestamp.Builder builder) {
            this._builder = builder;
        }

        public /* synthetic */ Dsl(Timestamp.Builder builder, kotlin.jvm.internal.h hVar) {
            this(builder);
        }

        public final /* synthetic */ Timestamp _build() {
            Timestamp build = this._builder.build();
            kotlin.jvm.internal.n.e(build, "_builder.build()");
            return build;
        }

        public final void clearNanos() {
            this._builder.clearNanos();
        }

        public final void clearSeconds() {
            this._builder.clearSeconds();
        }

        public final int getNanos() {
            return this._builder.getNanos();
        }

        public final long getSeconds() {
            return this._builder.getSeconds();
        }

        public final void setNanos(int i10) {
            this._builder.setNanos(i10);
        }

        public final void setSeconds(long j10) {
            this._builder.setSeconds(j10);
        }
    }

    private TimestampKt() {
    }
}
