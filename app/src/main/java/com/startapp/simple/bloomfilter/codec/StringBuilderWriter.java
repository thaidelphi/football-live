package com.startapp.simple.bloomfilter.codec;

import java.io.Serializable;
import java.io.Writer;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class StringBuilderWriter extends Writer implements Serializable {
    private static final long serialVersionUID = -8956169446715407818L;
    private final StringBuilder builder;

    public StringBuilderWriter() {
        this.builder = new StringBuilder();
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
    }

    public final String toString() {
        return this.builder.toString();
    }

    @Override // java.io.Writer
    public final void write(String str) {
        if (str != null) {
            this.builder.append(str);
        }
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i10, int i11) {
        if (cArr != null) {
            this.builder.append(cArr, i10, i11);
        }
    }

    public StringBuilderWriter(int i10) {
        this.builder = new StringBuilder(4);
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final Writer append(char c10) {
        this.builder.append(c10);
        return this;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final Writer append(CharSequence charSequence) {
        this.builder.append(charSequence);
        return this;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final Writer append(CharSequence charSequence, int i10, int i11) {
        this.builder.append(charSequence, i10, i11);
        return this;
    }
}
