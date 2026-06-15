package com.unity3d.ads.network.model;

import kotlin.jvm.internal.n;
/* compiled from: HttpBody.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public interface HttpBody {

    /* compiled from: HttpBody.kt */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class ByteArrayBody implements HttpBody {
        private final byte[] content;

        public ByteArrayBody(byte[] content) {
            n.f(content, "content");
            this.content = content;
        }

        public final byte[] getContent() {
            return this.content;
        }
    }

    /* compiled from: HttpBody.kt */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class EmptyBody implements HttpBody {
        public static final EmptyBody INSTANCE = new EmptyBody();

        private EmptyBody() {
        }
    }

    /* compiled from: HttpBody.kt */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class StringBody implements HttpBody {
        private final String content;

        public StringBody(String content) {
            n.f(content, "content");
            this.content = content;
        }

        public final String getContent() {
            return this.content;
        }
    }
}
