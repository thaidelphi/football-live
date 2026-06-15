package com.google.protobuf;

import com.google.protobuf.Empty;
import com.google.protobuf.kotlin.ProtoDslMarker;
/* compiled from: EmptyKt.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class EmptyKt {
    public static final EmptyKt INSTANCE = new EmptyKt();

    /* compiled from: EmptyKt.kt */
    @ProtoDslMarker
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final Empty.Builder _builder;

        /* compiled from: EmptyKt.kt */
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.h hVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(Empty.Builder builder) {
                kotlin.jvm.internal.n.f(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        private Dsl(Empty.Builder builder) {
            this._builder = builder;
        }

        public /* synthetic */ Dsl(Empty.Builder builder, kotlin.jvm.internal.h hVar) {
            this(builder);
        }

        public final /* synthetic */ Empty _build() {
            Empty build = this._builder.build();
            kotlin.jvm.internal.n.e(build, "_builder.build()");
            return build;
        }
    }

    private EmptyKt() {
    }
}
