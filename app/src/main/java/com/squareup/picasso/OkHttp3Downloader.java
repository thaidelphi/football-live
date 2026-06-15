package com.squareup.picasso;

import android.content.Context;
import java.io.File;
import java.io.IOException;
import n9.a0;
import n9.c;
import n9.e;
import n9.v;
import n9.y;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class OkHttp3Downloader implements Downloader {
    private final c cache;
    final e.a client;
    private boolean sharedClient;

    public OkHttp3Downloader(Context context) {
        this(Utils.createDefaultCacheDir(context));
    }

    @Override // com.squareup.picasso.Downloader
    public a0 load(y yVar) throws IOException {
        return this.client.c(yVar).b();
    }

    @Override // com.squareup.picasso.Downloader
    public void shutdown() {
        c cVar;
        if (this.sharedClient || (cVar = this.cache) == null) {
            return;
        }
        try {
            cVar.close();
        } catch (IOException unused) {
        }
    }

    public OkHttp3Downloader(File file) {
        this(file, Utils.calculateDiskCacheSize(file));
    }

    public OkHttp3Downloader(Context context, long j10) {
        this(Utils.createDefaultCacheDir(context), j10);
    }

    public OkHttp3Downloader(File file, long j10) {
        this(new v.b().b(new c(file, j10)).a());
        this.sharedClient = false;
    }

    public OkHttp3Downloader(v vVar) {
        this.sharedClient = true;
        this.client = vVar;
        this.cache = vVar.e();
    }

    public OkHttp3Downloader(e.a aVar) {
        this.sharedClient = true;
        this.client = aVar;
        this.cache = null;
    }
}
