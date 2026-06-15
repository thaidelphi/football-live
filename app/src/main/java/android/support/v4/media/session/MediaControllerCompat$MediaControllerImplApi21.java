package android.support.v4.media.session;

import android.os.Bundle;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.b;
import android.support.v4.media.session.c;
import android.util.Log;
import androidx.core.app.f;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
class MediaControllerCompat$MediaControllerImplApi21 {

    /* renamed from: a  reason: collision with root package name */
    final Object f651a;

    /* renamed from: b  reason: collision with root package name */
    private final List<c> f652b;

    /* renamed from: c  reason: collision with root package name */
    private HashMap<c, a> f653c;

    /* renamed from: d  reason: collision with root package name */
    final MediaSessionCompat.Token f654d;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    private static class ExtraBinderRequestResultReceiver extends ResultReceiver {

        /* renamed from: a  reason: collision with root package name */
        private WeakReference<MediaControllerCompat$MediaControllerImplApi21> f655a;

        @Override // android.os.ResultReceiver
        protected void onReceiveResult(int i10, Bundle bundle) {
            MediaControllerCompat$MediaControllerImplApi21 mediaControllerCompat$MediaControllerImplApi21 = this.f655a.get();
            if (mediaControllerCompat$MediaControllerImplApi21 == null || bundle == null) {
                return;
            }
            synchronized (mediaControllerCompat$MediaControllerImplApi21.f651a) {
                mediaControllerCompat$MediaControllerImplApi21.f654d.b(b.a.Z(f.a(bundle, "android.support.v4.media.session.EXTRA_BINDER")));
                mediaControllerCompat$MediaControllerImplApi21.f654d.c(b1.a.b(bundle, "android.support.v4.media.session.SESSION_TOKEN2"));
                mediaControllerCompat$MediaControllerImplApi21.a();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class a extends c.b {
        a(c cVar) {
            super(cVar);
        }

        @Override // android.support.v4.media.session.c.b, android.support.v4.media.session.a
        public void B(ParcelableVolumeInfo parcelableVolumeInfo) throws RemoteException {
            throw new AssertionError();
        }

        @Override // android.support.v4.media.session.c.b, android.support.v4.media.session.a
        public void M(Bundle bundle) throws RemoteException {
            throw new AssertionError();
        }

        @Override // android.support.v4.media.session.c.b, android.support.v4.media.session.a
        public void e0(CharSequence charSequence) throws RemoteException {
            throw new AssertionError();
        }

        @Override // android.support.v4.media.session.c.b, android.support.v4.media.session.a
        public void v(List<MediaSessionCompat.QueueItem> list) throws RemoteException {
            throw new AssertionError();
        }

        @Override // android.support.v4.media.session.c.b, android.support.v4.media.session.a
        public void w() throws RemoteException {
            throw new AssertionError();
        }

        @Override // android.support.v4.media.session.c.b, android.support.v4.media.session.a
        public void x(MediaMetadataCompat mediaMetadataCompat) throws RemoteException {
            throw new AssertionError();
        }
    }

    void a() {
        if (this.f654d.a() == null) {
            return;
        }
        for (c cVar : this.f652b) {
            a aVar = new a(cVar);
            this.f653c.put(cVar, aVar);
            cVar.f689b = aVar;
            try {
                this.f654d.a().C(aVar);
                cVar.i(13, null, null);
            } catch (RemoteException e8) {
                Log.e("MediaControllerCompat", "Dead object in registerCallback.", e8);
            }
        }
        this.f652b.clear();
    }
}
