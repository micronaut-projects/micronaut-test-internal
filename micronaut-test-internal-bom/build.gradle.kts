plugins {
    id("io.micronaut.build.internal.micronaut-test-internal-base")
    id("io.micronaut.build.internal.bom")
}
micronautBuild {
    binaryCompatibility.enabledAfter("1.0.0")
}
