package clustercode.api.transcode;

import clustercode.api.domain.Media;
import clustercode.api.domain.OutputFrameTuple;
import clustercode.api.domain.Profile;

import java.util.function.Consumer;

public interface TranscodeProgress {

    Media getMedia();

    Profile getProfile();

    TranscodeProgress withStdErrListener(Consumer<String> listener);

    TranscodeProgress withStdOutListener(Consumer<String> listener);

    TranscodeProgress withOutputListener(Consumer<OutputFrameTuple> listener);

}
