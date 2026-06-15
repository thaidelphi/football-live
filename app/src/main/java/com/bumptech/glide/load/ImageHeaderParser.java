package com.bumptech.glide.load;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import z1.b;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public interface ImageHeaderParser {

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public enum ImageType {
        GIF(true),
        JPEG(false),
        RAW(false),
        PNG_A(true),
        PNG(false),
        WEBP_A(true),
        WEBP(false),
        UNKNOWN(false);
        

        /* renamed from: a  reason: collision with root package name */
        private final boolean f10330a;

        ImageType(boolean z10) {
            this.f10330a = z10;
        }

        public boolean hasAlpha() {
            return this.f10330a;
        }
    }

    int a(InputStream inputStream, b bVar) throws IOException;

    ImageType b(ByteBuffer byteBuffer) throws IOException;

    ImageType c(InputStream inputStream) throws IOException;
}
