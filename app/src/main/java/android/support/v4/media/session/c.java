package android.support.v4.media.session;

import android.media.MediaMetadata;
import android.media.session.MediaController;
import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.a;
import androidx.media.AudioAttributesCompat;
import java.lang.ref.WeakReference;
import java.util.List;
/* compiled from: MediaControllerCompat.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public abstract class c implements IBinder.DeathRecipient {

    /* renamed from: a  reason: collision with root package name */
    final MediaController.Callback f688a;

    /* renamed from: b  reason: collision with root package name */
    android.support.v4.media.session.a f689b;

    /* compiled from: MediaControllerCompat.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    private static class a extends MediaController.Callback {

        /* renamed from: a  reason: collision with root package name */
        private final WeakReference<c> f690a;

        a(c cVar) {
            this.f690a = new WeakReference<>(cVar);
        }

        @Override // android.media.session.MediaController.Callback
        public void onAudioInfoChanged(MediaController.PlaybackInfo playbackInfo) {
            c cVar = this.f690a.get();
            if (cVar != null) {
                cVar.a(new d(playbackInfo.getPlaybackType(), AudioAttributesCompat.c(playbackInfo.getAudioAttributes()), playbackInfo.getVolumeControl(), playbackInfo.getMaxVolume(), playbackInfo.getCurrentVolume()));
            }
        }

        @Override // android.media.session.MediaController.Callback
        public void onExtrasChanged(Bundle bundle) {
            MediaSessionCompat.a(bundle);
            c cVar = this.f690a.get();
            if (cVar != null) {
                cVar.b(bundle);
            }
        }

        @Override // android.media.session.MediaController.Callback
        public void onMetadataChanged(MediaMetadata mediaMetadata) {
            c cVar = this.f690a.get();
            if (cVar != null) {
                cVar.c(MediaMetadataCompat.a(mediaMetadata));
            }
        }

        @Override // android.media.session.MediaController.Callback
        public void onPlaybackStateChanged(PlaybackState playbackState) {
            c cVar = this.f690a.get();
            if (cVar == null || cVar.f689b != null) {
                return;
            }
            cVar.d(PlaybackStateCompat.a(playbackState));
        }

        @Override // android.media.session.MediaController.Callback
        public void onQueueChanged(List<MediaSession.QueueItem> list) {
            c cVar = this.f690a.get();
            if (cVar != null) {
                cVar.e(MediaSessionCompat.QueueItem.b(list));
            }
        }

        @Override // android.media.session.MediaController.Callback
        public void onQueueTitleChanged(CharSequence charSequence) {
            c cVar = this.f690a.get();
            if (cVar != null) {
                cVar.f(charSequence);
            }
        }

        @Override // android.media.session.MediaController.Callback
        public void onSessionDestroyed() {
            c cVar = this.f690a.get();
            if (cVar != null) {
                cVar.g();
            }
        }

        @Override // android.media.session.MediaController.Callback
        public void onSessionEvent(String str, Bundle bundle) {
            MediaSessionCompat.a(bundle);
            c cVar = this.f690a.get();
            if (cVar != null) {
                if (cVar.f689b == null || Build.VERSION.SDK_INT >= 23) {
                    cVar.h(str, bundle);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: MediaControllerCompat.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class b extends a.AbstractBinderC0013a {

        /* renamed from: a  reason: collision with root package name */
        private final WeakReference<c> f691a;

        /* JADX INFO: Access modifiers changed from: package-private */
        public b(c cVar) {
            this.f691a = new WeakReference<>(cVar);
        }

        public void B(ParcelableVolumeInfo parcelableVolumeInfo) throws RemoteException {
            c cVar = this.f691a.get();
            if (cVar != null) {
                cVar.i(4, parcelableVolumeInfo != null ? new d(parcelableVolumeInfo.f664a, parcelableVolumeInfo.f665b, parcelableVolumeInfo.f666c, parcelableVolumeInfo.f667d, parcelableVolumeInfo.f668e) : null, null);
            }
        }

        public void M(Bundle bundle) throws RemoteException {
            c cVar = this.f691a.get();
            if (cVar != null) {
                cVar.i(7, bundle, null);
            }
        }

        @Override // android.support.v4.media.session.a
        public void V(boolean z10) throws RemoteException {
            c cVar = this.f691a.get();
            if (cVar != null) {
                cVar.i(11, Boolean.valueOf(z10), null);
            }
        }

        @Override // android.support.v4.media.session.a
        public void d0(boolean z10) throws RemoteException {
        }

        public void e0(CharSequence charSequence) throws RemoteException {
            c cVar = this.f691a.get();
            if (cVar != null) {
                cVar.i(6, charSequence, null);
            }
        }

        @Override // android.support.v4.media.session.a
        public void onEvent(String str, Bundle bundle) throws RemoteException {
            c cVar = this.f691a.get();
            if (cVar != null) {
                cVar.i(1, str, bundle);
            }
        }

        @Override // android.support.v4.media.session.a
        public void s0(PlaybackStateCompat playbackStateCompat) throws RemoteException {
            c cVar = this.f691a.get();
            if (cVar != null) {
                cVar.i(2, playbackStateCompat, null);
            }
        }

        @Override // android.support.v4.media.session.a
        public void t(int i10) throws RemoteException {
            c cVar = this.f691a.get();
            if (cVar != null) {
                cVar.i(9, Integer.valueOf(i10), null);
            }
        }

        @Override // android.support.v4.media.session.a
        public void u() throws RemoteException {
            c cVar = this.f691a.get();
            if (cVar != null) {
                cVar.i(13, null, null);
            }
        }

        public void v(List<MediaSessionCompat.QueueItem> list) throws RemoteException {
            c cVar = this.f691a.get();
            if (cVar != null) {
                cVar.i(5, list, null);
            }
        }

        public void w() throws RemoteException {
            c cVar = this.f691a.get();
            if (cVar != null) {
                cVar.i(8, null, null);
            }
        }

        public void x(MediaMetadataCompat mediaMetadataCompat) throws RemoteException {
            c cVar = this.f691a.get();
            if (cVar != null) {
                cVar.i(3, mediaMetadataCompat, null);
            }
        }

        @Override // android.support.v4.media.session.a
        public void y(int i10) throws RemoteException {
            c cVar = this.f691a.get();
            if (cVar != null) {
                cVar.i(12, Integer.valueOf(i10), null);
            }
        }
    }

    public c() {
        if (Build.VERSION.SDK_INT >= 21) {
            this.f688a = new a(this);
            return;
        }
        this.f688a = null;
        this.f689b = new b(this);
    }

    public void a(d dVar) {
    }

    public void b(Bundle bundle) {
    }

    @Override // android.os.IBinder.DeathRecipient
    public void binderDied() {
        i(8, null, null);
    }

    public void c(MediaMetadataCompat mediaMetadataCompat) {
    }

    public void d(PlaybackStateCompat playbackStateCompat) {
    }

    public void e(List<MediaSessionCompat.QueueItem> list) {
    }

    public void f(CharSequence charSequence) {
    }

    public void g() {
    }

    public void h(String str, Bundle bundle) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void i(int i10, Object obj, Bundle bundle) {
    }
}
