A trick to save time on LibreOffice startup. Idea is to prevent LibreOffice daemon from exiting by establishing idle UNO connection.

Prerequsites
------------
* LibreOffice
* JDK (tested on version 8, but probably almost any version will suffice)
* SystemD (optional, used for managing the daemon processes)

Instructions
------------
1. Clone this repository.

2. Run `make` to compile the java code.

3. Copy `libreoffice.service` and `libreoffice-termination-blocker.service` to `~/.config/systemd/user/`.

4. Edit `WorkingDirectory=` entry in `libreoffice-termination-blocker.service` to point to TerminationBlocker.class location.

5. Run `systemctl --user enable --now libreoffice` and `systemctl --user enable --now libreoffice-termination-blocker`.
