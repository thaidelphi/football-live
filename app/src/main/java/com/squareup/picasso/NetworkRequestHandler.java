package com.squareup.picasso;

import android.net.NetworkInfo;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.RequestHandler;
import java.io.IOException;
import n9.a0;
import n9.b0;
import n9.d;
import n9.y;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class NetworkRequestHandler extends RequestHandler {
    private static final String SCHEME_HTTP = "http";
    private static final String SCHEME_HTTPS = "https";
    private final Downloader downloader;
    private final Stats stats;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class ContentLengthException extends IOException {
        ContentLengthException(String str) {
            super(str);
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    static final class ResponseException extends IOException {
        final int code;
        final int networkPolicy;

        ResponseException(int i10, int i11) {
            super("HTTP " + i10);
            this.code = i10;
            this.networkPolicy = i11;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public NetworkRequestHandler(Downloader downloader, Stats stats) {
        this.downloader = downloader;
        this.stats = stats;
    }

    private static y createRequest(Request request, int i10) {
        d dVar;
        if (i10 == 0) {
            dVar = null;
        } else if (NetworkPolicy.isOfflineOnly(i10)) {
            dVar = d.f28754o;
        } else {
            d.a aVar = new d.a();
            if (!NetworkPolicy.shouldReadFromDiskCache(i10)) {
                aVar.c();
            }
            if (!NetworkPolicy.shouldWriteToDiskCache(i10)) {
                aVar.d();
            }
            dVar = aVar.a();
        }
        y.a h10 = new y.a().h(request.uri.toString());
        if (dVar != null) {
            h10.c(dVar);
        }
        return h10.b();
    }

    @Override // com.squareup.picasso.RequestHandler
    public boolean canHandleRequest(Request request) {
        String scheme = request.uri.getScheme();
        return SCHEME_HTTP.equals(scheme) || "https".equals(scheme);
    }

    @Override // com.squareup.picasso.RequestHandler
    int getRetryCount() {
        return 2;
    }

    @Override // com.squareup.picasso.RequestHandler
    public RequestHandler.Result load(Request request, int i10) throws IOException {
        a0 load = this.downloader.load(createRequest(request, i10));
        b0 a10 = load.a();
        if (load.E()) {
            Picasso.LoadedFrom loadedFrom = load.f() == null ? Picasso.LoadedFrom.NETWORK : Picasso.LoadedFrom.DISK;
            if (loadedFrom == Picasso.LoadedFrom.DISK && a10.b() == 0) {
                a10.close();
                throw new ContentLengthException("Received response with 0 content-length header.");
            }
            if (loadedFrom == Picasso.LoadedFrom.NETWORK && a10.b() > 0) {
                this.stats.dispatchDownloadFinished(a10.b());
            }
            return new RequestHandler.Result(a10.t(), loadedFrom);
        }
        a10.close();
        throw new ResponseException(load.j(), request.networkPolicy);
    }

    @Override // com.squareup.picasso.RequestHandler
    boolean shouldRetry(boolean z10, NetworkInfo networkInfo) {
        return networkInfo == null || networkInfo.isConnected();
    }

    @Override // com.squareup.picasso.RequestHandler
    boolean supportsReplay() {
        return true;
    }
}
