package com.unity3d.mediation;

import com.unity3d.mediation.LevelPlay;
import j8.o;
import java.util.List;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.n;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class LevelPlayInitRequest {

    /* renamed from: a  reason: collision with root package name */
    private final String f23782a;

    /* renamed from: b  reason: collision with root package name */
    private final String f23783b;

    /* renamed from: c  reason: collision with root package name */
    private final List<LevelPlay.AdFormat> f23784c;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class Builder {

        /* renamed from: a  reason: collision with root package name */
        private final String f23785a;

        /* renamed from: b  reason: collision with root package name */
        private String f23786b;

        /* renamed from: c  reason: collision with root package name */
        private List<? extends LevelPlay.AdFormat> f23787c;

        public Builder(String appKey) {
            n.f(appKey, "appKey");
            this.f23785a = appKey;
        }

        public final LevelPlayInitRequest build() {
            String str = this.f23785a;
            String str2 = this.f23786b;
            List<? extends LevelPlay.AdFormat> list = this.f23787c;
            if (list == null) {
                list = o.d();
            }
            return new LevelPlayInitRequest(str, str2, list, null);
        }

        public final String getAppKey() {
            return this.f23785a;
        }

        public final Builder withLegacyAdFormats(List<? extends LevelPlay.AdFormat> legacyAdFormats) {
            n.f(legacyAdFormats, "legacyAdFormats");
            this.f23787c = legacyAdFormats;
            return this;
        }

        public final Builder withUserId(String userId) {
            n.f(userId, "userId");
            this.f23786b = userId;
            return this;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private LevelPlayInitRequest(String str, String str2, List<? extends LevelPlay.AdFormat> list) {
        this.f23782a = str;
        this.f23783b = str2;
        this.f23784c = list;
    }

    public /* synthetic */ LevelPlayInitRequest(String str, String str2, List list, h hVar) {
        this(str, str2, list);
    }

    public final String getAppKey() {
        return this.f23782a;
    }

    public final List<LevelPlay.AdFormat> getLegacyAdFormats() {
        return this.f23784c;
    }

    public final String getUserId() {
        return this.f23783b;
    }
}
