package com.google.protobuf;

import com.google.protobuf.SourceContext;
import com.google.protobuf.kotlin.ProtoDslMarker;
/* compiled from: SourceContextKt.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class SourceContextKt {
    public static final SourceContextKt INSTANCE = new SourceContextKt();

    /* compiled from: SourceContextKt.kt */
    @ProtoDslMarker
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final SourceContext.Builder _builder;

        /* compiled from: SourceContextKt.kt */
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.h hVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(SourceContext.Builder builder) {
                kotlin.jvm.internal.n.f(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        private Dsl(SourceContext.Builder builder) {
            this._builder = builder;
        }

        public /* synthetic */ Dsl(SourceContext.Builder builder, kotlin.jvm.internal.h hVar) {
            this(builder);
        }

        public final /* synthetic */ SourceContext _build() {
            SourceContext build = this._builder.build();
            kotlin.jvm.internal.n.e(build, "_builder.build()");
            return build;
        }

        public final void clearFileName() {
            this._builder.clearFileName();
        }

        public final String getFileName() {
            String fileName = this._builder.getFileName();
            kotlin.jvm.internal.n.e(fileName, "_builder.getFileName()");
            return fileName;
        }

        public final void setFileName(String value) {
            kotlin.jvm.internal.n.f(value, "value");
            this._builder.setFileName(value);
        }
    }

    private SourceContextKt() {
    }
}
