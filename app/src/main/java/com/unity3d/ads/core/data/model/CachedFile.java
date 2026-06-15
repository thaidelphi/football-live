package com.unity3d.ads.core.data.model;

import androidx.privacysandbox.ads.adservices.topics.d;
import java.io.File;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.n;
/* compiled from: CachedFile.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class CachedFile {
    private final long contentLength;
    private final String extension;
    private final File file;
    private final String name;
    private final String objectId;
    private final int priority;
    private final String protocol;
    private final String url;

    public CachedFile(String objectId, String url, String name, File file, String str, long j10, String protocol, int i10) {
        n.f(objectId, "objectId");
        n.f(url, "url");
        n.f(name, "name");
        n.f(protocol, "protocol");
        this.objectId = objectId;
        this.url = url;
        this.name = name;
        this.file = file;
        this.extension = str;
        this.contentLength = j10;
        this.protocol = protocol;
        this.priority = i10;
    }

    public final String component1() {
        return this.objectId;
    }

    public final String component2() {
        return this.url;
    }

    public final String component3() {
        return this.name;
    }

    public final File component4() {
        return this.file;
    }

    public final String component5() {
        return this.extension;
    }

    public final long component6() {
        return this.contentLength;
    }

    public final String component7() {
        return this.protocol;
    }

    public final int component8() {
        return this.priority;
    }

    public final CachedFile copy(String objectId, String url, String name, File file, String str, long j10, String protocol, int i10) {
        n.f(objectId, "objectId");
        n.f(url, "url");
        n.f(name, "name");
        n.f(protocol, "protocol");
        return new CachedFile(objectId, url, name, file, str, j10, protocol, i10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CachedFile) {
            CachedFile cachedFile = (CachedFile) obj;
            return n.a(this.objectId, cachedFile.objectId) && n.a(this.url, cachedFile.url) && n.a(this.name, cachedFile.name) && n.a(this.file, cachedFile.file) && n.a(this.extension, cachedFile.extension) && this.contentLength == cachedFile.contentLength && n.a(this.protocol, cachedFile.protocol) && this.priority == cachedFile.priority;
        }
        return false;
    }

    public final long getContentLength() {
        return this.contentLength;
    }

    public final String getExtension() {
        return this.extension;
    }

    public final File getFile() {
        return this.file;
    }

    public final String getName() {
        return this.name;
    }

    public final String getObjectId() {
        return this.objectId;
    }

    public final int getPriority() {
        return this.priority;
    }

    public final String getProtocol() {
        return this.protocol;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        int hashCode = ((((this.objectId.hashCode() * 31) + this.url.hashCode()) * 31) + this.name.hashCode()) * 31;
        File file = this.file;
        int hashCode2 = (hashCode + (file == null ? 0 : file.hashCode())) * 31;
        String str = this.extension;
        return ((((((hashCode2 + (str != null ? str.hashCode() : 0)) * 31) + d.a(this.contentLength)) * 31) + this.protocol.hashCode()) * 31) + this.priority;
    }

    public String toString() {
        return "CachedFile(objectId=" + this.objectId + ", url=" + this.url + ", name=" + this.name + ", file=" + this.file + ", extension=" + this.extension + ", contentLength=" + this.contentLength + ", protocol=" + this.protocol + ", priority=" + this.priority + ')';
    }

    public /* synthetic */ CachedFile(String str, String str2, String str3, File file, String str4, long j10, String str5, int i10, int i11, h hVar) {
        this(str, str2, str3, (i11 & 8) != 0 ? null : file, (i11 & 16) != 0 ? "" : str4, (i11 & 32) != 0 ? -1L : j10, (i11 & 64) != 0 ? "" : str5, (i11 & 128) != 0 ? Integer.MAX_VALUE : i10);
    }
}
