package at.adesso.leagueapi.testcommons.util;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Objects;

public class TestFileUtils {
    public static String readFileAsString(final String path) {
        try {
            return Files.readString(Path.of(Objects.requireNonNull(TestFileUtils.class.getResource(path)).toURI()));
        } catch (final IOException | URISyntaxException e) {
            throw new RuntimeException(e);
        }
    }
}
