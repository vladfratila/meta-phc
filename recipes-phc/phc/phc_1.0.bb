DESCRIPTION = "Pi Heat Control Node JS Application"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"


SRCREV = "${AUTOREV}"
SRC_URI = "git://github.com/vladfratila/pi-heat-control.git;branch=master"

S = "${WORKDIR}"

do_install() {
        install -d ${D}/usr/local/phc
        cp  git/* ${D}/usr/local/phc
}

FILES_${PN} += "\
                /usr/local/phc/* \"
