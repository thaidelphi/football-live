package android.support.v4.media.session;

import android.annotation.SuppressLint;
import android.media.session.PlaybackState;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
@SuppressLint({"BanParcelableUsage"})
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class PlaybackStateCompat implements Parcelable {
    public static final Parcelable.Creator<PlaybackStateCompat> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    final int f669a;

    /* renamed from: b  reason: collision with root package name */
    final long f670b;

    /* renamed from: c  reason: collision with root package name */
    final long f671c;

    /* renamed from: d  reason: collision with root package name */
    final float f672d;

    /* renamed from: e  reason: collision with root package name */
    final long f673e;

    /* renamed from: f  reason: collision with root package name */
    final int f674f;

    /* renamed from: g  reason: collision with root package name */
    final CharSequence f675g;

    /* renamed from: h  reason: collision with root package name */
    final long f676h;

    /* renamed from: i  reason: collision with root package name */
    List<CustomAction> f677i;

    /* renamed from: j  reason: collision with root package name */
    final long f678j;

    /* renamed from: k  reason: collision with root package name */
    final Bundle f679k;

    /* renamed from: l  reason: collision with root package name */
    private PlaybackState f680l;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class a implements Parcelable.Creator<PlaybackStateCompat> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public PlaybackStateCompat createFromParcel(Parcel parcel) {
            return new PlaybackStateCompat(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public PlaybackStateCompat[] newArray(int i10) {
            return new PlaybackStateCompat[i10];
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class b {
        static void a(PlaybackState.Builder builder, PlaybackState.CustomAction customAction) {
            builder.addCustomAction(customAction);
        }

        static PlaybackState.CustomAction b(PlaybackState.CustomAction.Builder builder) {
            return builder.build();
        }

        static PlaybackState c(PlaybackState.Builder builder) {
            return builder.build();
        }

        static PlaybackState.Builder d() {
            return new PlaybackState.Builder();
        }

        static PlaybackState.CustomAction.Builder e(String str, CharSequence charSequence, int i10) {
            return new PlaybackState.CustomAction.Builder(str, charSequence, i10);
        }

        static String f(PlaybackState.CustomAction customAction) {
            return customAction.getAction();
        }

        static long g(PlaybackState playbackState) {
            return playbackState.getActions();
        }

        static long h(PlaybackState playbackState) {
            return playbackState.getActiveQueueItemId();
        }

        static long i(PlaybackState playbackState) {
            return playbackState.getBufferedPosition();
        }

        static List<PlaybackState.CustomAction> j(PlaybackState playbackState) {
            return playbackState.getCustomActions();
        }

        static CharSequence k(PlaybackState playbackState) {
            return playbackState.getErrorMessage();
        }

        static Bundle l(PlaybackState.CustomAction customAction) {
            return customAction.getExtras();
        }

        static int m(PlaybackState.CustomAction customAction) {
            return customAction.getIcon();
        }

        static long n(PlaybackState playbackState) {
            return playbackState.getLastPositionUpdateTime();
        }

        static CharSequence o(PlaybackState.CustomAction customAction) {
            return customAction.getName();
        }

        static float p(PlaybackState playbackState) {
            return playbackState.getPlaybackSpeed();
        }

        static long q(PlaybackState playbackState) {
            return playbackState.getPosition();
        }

        static int r(PlaybackState playbackState) {
            return playbackState.getState();
        }

        static void s(PlaybackState.Builder builder, long j10) {
            builder.setActions(j10);
        }

        static void t(PlaybackState.Builder builder, long j10) {
            builder.setActiveQueueItemId(j10);
        }

        static void u(PlaybackState.Builder builder, long j10) {
            builder.setBufferedPosition(j10);
        }

        static void v(PlaybackState.Builder builder, CharSequence charSequence) {
            builder.setErrorMessage(charSequence);
        }

        static void w(PlaybackState.CustomAction.Builder builder, Bundle bundle) {
            builder.setExtras(bundle);
        }

        static void x(PlaybackState.Builder builder, int i10, long j10, float f10, long j11) {
            builder.setState(i10, j10, f10, j11);
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    private static class c {
        static Bundle a(PlaybackState playbackState) {
            return playbackState.getExtras();
        }

        static void b(PlaybackState.Builder builder, Bundle bundle) {
            builder.setExtras(bundle);
        }
    }

    PlaybackStateCompat(int i10, long j10, long j11, float f10, long j12, int i11, CharSequence charSequence, long j13, List<CustomAction> list, long j14, Bundle bundle) {
        this.f669a = i10;
        this.f670b = j10;
        this.f671c = j11;
        this.f672d = f10;
        this.f673e = j12;
        this.f674f = i11;
        this.f675g = charSequence;
        this.f676h = j13;
        this.f677i = new ArrayList(list);
        this.f678j = j14;
        this.f679k = bundle;
    }

    public static PlaybackStateCompat a(Object obj) {
        ArrayList arrayList;
        Bundle bundle = null;
        if (obj == null || Build.VERSION.SDK_INT < 21) {
            return null;
        }
        PlaybackState playbackState = (PlaybackState) obj;
        List<PlaybackState.CustomAction> j10 = b.j(playbackState);
        if (j10 != null) {
            ArrayList arrayList2 = new ArrayList(j10.size());
            for (PlaybackState.CustomAction customAction : j10) {
                arrayList2.add(CustomAction.a(customAction));
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        if (Build.VERSION.SDK_INT >= 22) {
            bundle = c.a(playbackState);
            MediaSessionCompat.a(bundle);
        }
        PlaybackStateCompat playbackStateCompat = new PlaybackStateCompat(b.r(playbackState), b.q(playbackState), b.i(playbackState), b.p(playbackState), b.g(playbackState), 0, b.k(playbackState), b.n(playbackState), arrayList, b.h(playbackState), bundle);
        playbackStateCompat.f680l = playbackState;
        return playbackStateCompat;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "PlaybackState {state=" + this.f669a + ", position=" + this.f670b + ", buffered position=" + this.f671c + ", speed=" + this.f672d + ", updated=" + this.f676h + ", actions=" + this.f673e + ", error code=" + this.f674f + ", error message=" + this.f675g + ", custom actions=" + this.f677i + ", active item id=" + this.f678j + "}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f669a);
        parcel.writeLong(this.f670b);
        parcel.writeFloat(this.f672d);
        parcel.writeLong(this.f676h);
        parcel.writeLong(this.f671c);
        parcel.writeLong(this.f673e);
        TextUtils.writeToParcel(this.f675g, parcel, i10);
        parcel.writeTypedList(this.f677i);
        parcel.writeLong(this.f678j);
        parcel.writeBundle(this.f679k);
        parcel.writeInt(this.f674f);
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class CustomAction implements Parcelable {
        public static final Parcelable.Creator<CustomAction> CREATOR = new a();

        /* renamed from: a  reason: collision with root package name */
        private final String f681a;

        /* renamed from: b  reason: collision with root package name */
        private final CharSequence f682b;

        /* renamed from: c  reason: collision with root package name */
        private final int f683c;

        /* renamed from: d  reason: collision with root package name */
        private final Bundle f684d;

        /* renamed from: e  reason: collision with root package name */
        private PlaybackState.CustomAction f685e;

        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
        class a implements Parcelable.Creator<CustomAction> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public CustomAction createFromParcel(Parcel parcel) {
                return new CustomAction(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public CustomAction[] newArray(int i10) {
                return new CustomAction[i10];
            }
        }

        CustomAction(String str, CharSequence charSequence, int i10, Bundle bundle) {
            this.f681a = str;
            this.f682b = charSequence;
            this.f683c = i10;
            this.f684d = bundle;
        }

        public static CustomAction a(Object obj) {
            if (obj == null || Build.VERSION.SDK_INT < 21) {
                return null;
            }
            PlaybackState.CustomAction customAction = (PlaybackState.CustomAction) obj;
            Bundle l10 = b.l(customAction);
            MediaSessionCompat.a(l10);
            CustomAction customAction2 = new CustomAction(b.f(customAction), b.o(customAction), b.m(customAction), l10);
            customAction2.f685e = customAction;
            return customAction2;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public String toString() {
            return "Action:mName='" + ((Object) this.f682b) + ", mIcon=" + this.f683c + ", mExtras=" + this.f684d;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeString(this.f681a);
            TextUtils.writeToParcel(this.f682b, parcel, i10);
            parcel.writeInt(this.f683c);
            parcel.writeBundle(this.f684d);
        }

        CustomAction(Parcel parcel) {
            this.f681a = parcel.readString();
            this.f682b = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f683c = parcel.readInt();
            this.f684d = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        }
    }

    PlaybackStateCompat(Parcel parcel) {
        this.f669a = parcel.readInt();
        this.f670b = parcel.readLong();
        this.f672d = parcel.readFloat();
        this.f676h = parcel.readLong();
        this.f671c = parcel.readLong();
        this.f673e = parcel.readLong();
        this.f675g = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f677i = parcel.createTypedArrayList(CustomAction.CREATOR);
        this.f678j = parcel.readLong();
        this.f679k = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        this.f674f = parcel.readInt();
    }
}
