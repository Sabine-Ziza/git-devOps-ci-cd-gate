# Git DevOps & CI/CD Gate

## Git  Questions

### Git question 1,2,3

  ```bash
   USER@LAPTOP-L1U2P979 MINGW64 /d/seleniumTest (main)
$ git init
Reinitialized existing Git repository in D:/seleniumTest/.git/

US ER@LAPTOP-L1U2P979 MINGW64 /d/seleniumTest (main)
$ git remote add origin https://github.com/Sabine-Ziza/git-devOps-ci-cd-gate.git

USER@LAPTOP-L1U2P979 MINGW64 /d/seleniumTest (main)
$ git remote -v
origin  https://github.com/Sabine-Ziza/git-devOps-ci-cd-gate.git (fetch)
origin  https://github.com/Sabine-Ziza/git-devOps-ci-cd-gate.git (push)

USER@LAPTOP-L1U2P979 MINGW64 /d/seleniumTest (main)
$ git checkout -b dev
Switched to a new branch 'dev'

USER@LAPTOP-L1U2P979 MINGW64 /d/seleniumTest (dev)
$ git push -u origin dev
error: src refspec dev does not match any
error: failed to push some refs to 'https://github.com/Sabine-Ziza/git-devOps-ci-cd-gate.git'                                                                       
                                                                                  
USER@LAPTOP-L1U2P979 MINGW64 /d/seleniumTest (dev)
$ git checkout main
error: pathspec 'main' did not match any file(s) known to git

USER@LAPTOP-L1U2P979 MINGW64 /d/seleniumTest (dev)
$ git branch

USER@LAPTOP-L1U2P979 MINGW64 /d/seleniumTest (dev)
$ git fetch origin
remote: Enumerating objects: 3, done.
remote: Counting objects: 100% (3/3), done.
remote: Total 3 (delta 0), reused 0 (delta 0), pack-reused 0 (from 0)
Unpacking objects: 100% (3/3), 877 bytes | 39.00 KiB/s, done.
From https://github.com/Sabine-Ziza/git-devOps-ci-cd-gate
 * [new branch]      main       -> origin/main

USER@LAPTOP-L1U2P979 MINGW64 /d/seleniumTest (dev)
$ git checkout -b main origin/main
branch 'main' set up to track 'origin/main'.
Switched to a new branch 'main'

USER@LAPTOP-L1U2P979 MINGW64 /d/seleniumTest (main)
$ git checkout dev
error: pathspec 'dev' did not match any file(s) known to git

USER@LAPTOP-L1U2P979 MINGW64 /d/seleniumTest (main)
$ git checkout -b dev
Switched to a new branch 'dev'

USER@LAPTOP-L1U2P979 MINGW64 /d/seleniumTest (dev)
$ echo "my first dev file" > dev-file.txt

USER@LAPTOP-L1U2P979 MINGW64 /d/seleniumTest (dev)
$ git add dev-file.txt
warning: in the working copy of 'dev-file.txt', LF will be replaced by CRLF the next time Git touches it

USER@LAPTOP-L1U2P979 MINGW64 /d/seleniumTest (dev)
$ git commit -m "initial commit on dev"
[dev f4cf338] initial commit on dev
 1 file changed, 1 insertion(+)
 create mode 100644 dev-file.txt

USER@LAPTOP-L1U2P979 MINGW64 /d/seleniumTest (dev)
$ git push -u origin dev
Enumerating objects: 4, done.
Counting objects: 100% (4/4), done.
Delta compression using up to 12 threads
Compressing objects: 100% (2/2), done.
Writing objects: 100% (3/3), 313 bytes | 156.00 KiB/s, done.
Total 3 (delta 0), reused 0 (delta 0), pack-reused 0 (from 0)
remote: 
remote: Create a pull request for 'dev' on GitHub by visiting:
remote:      https://github.com/Sabine-Ziza/git-devOps-ci-cd-gate/pull/new/dev
remote: 
To https://github.com/Sabine-Ziza/git-devOps-ci-cd-gate.git
 * [new branch]      dev -> dev
branch 'dev' set up to track 'origin/dev'.
```
### question 4

```bash
USER@LAPTOP-L1U2P979 MINGW64 /d/seleniumTest (dev)
$ git checkout -b test
Switched to a new branch 'test'

USER@LAPTOP-L1U2P979 MINGW64 /d/seleniumTest (test)
$ git branch
  dev
  main
* test

USER@LAPTOP-L1U2P979 MINGW64 /d/seleniumTest (test)
$ git checkout dev
M       README.md
Switched to branch 'dev'
Your branch is up to date with 'origin/dev'.

USER@LAPTOP-L1U2P979 MINGW64 /d/seleniumTest (dev)
$ git branch -d test
Deleted branch test (was f4cf338).
```
### question 5,6,7,8,9,10

```bash
USER@LAPTOP-L1U2P979 MINGW64 /d/seleniumTest (ft/setup)
$ pwd
/d/seleniumTest

USER@LAPTOP-L1U2P979 MINGW64 /d/seleniumTest (ft/setup)
$ touch test.java

USER@LAPTOP-L1U2P979 MINGW64 /d/seleniumTest (ft/setup)
$ git add test.java

USER@LAPTOP-L1U2P979 MINGW64 /d/seleniumTest (ft/setup)
$ git commit -m "create placeholder for test.java"
[ft/setup fb84427] create placeholder for test.java
 2 files changed, 6 insertions(+), 1 deletion(-)
 delete mode 100644 README.md
 create mode 100644 test.java

USER@LAPTOP-L1U2P979 MINGW64 /d/seleniumTest (ft/setup)
$ git stash push -m "WIP: testing test.java"
Saved working directory and index state On ft/setup: WIP: testing test.java

USER@LAPTOP-L1U2P979 MINGW64 /d/seleniumTest (ft/setup)
$ git stash list
stash@{0}: On ft/setup: WIP: testing test.java

USER@LAPTOP-L1U2P979 MINGW64 /d/seleniumTest (ft/setup)
$ git stash apply stash@{0}
On branch ft/setup
Changes not staged for commit:
  (use "git add <file>..." to update what will be committed)
  (use "git restore <file>..." to discard changes in working directory)
        modified:   test.java

Untracked files:
  (use "git add <file>..." to include in what will be committed)
        Exercises/

no changes added to commit (use "git add" and/or "git commit -a")

USER@LAPTOP-L1U2P979 MINGW64 /d/seleniumTest (ft/setup)
$ git branch
  dev
* ft/setup
  main

USER@LAPTOP-L1U2P979 MINGW64 /d/seleniumTest (ft/setup)
$ git push -u origin ft/setup
Enumerating objects: 4, done.
Counting objects: 100% (4/4), done.
Delta compression using up to 12 threads
Compressing objects: 100% (3/3), done.
Writing objects: 100% (3/3), 434 bytes | 217.00 KiB/s, done.
Total 3 (delta 0), reused 0 (delta 0), pack-reused 0 (from 0)
remote: 
remote: Create a pull request for 'ft/setup' on GitHub by visiting:
remote:      https://github.com/Sabine-Ziza/git-devOps-ci-cd-gate/pull/new/ft/setup
remote: 
To https://github.com/Sabine-Ziza/git-devOps-ci-cd-gate.git
 * [new branch]      ft/setup -> ft/setup
branch 'ft/setup' set up to track 'origin/ft/setup'.

USER@LAPTOP-L1U2P979 MINGW64 /d/seleniumTest (ft/setup)
$ git checkout main
error: Your local changes to the following files would be overwritten by checkout:
        test.java
Please commit your changes or stash them before you switch branches.
Aborting

USER@LAPTOP-L1U2P979 MINGW64 /d/seleniumTest (ft/setup)
$ git stage push
fatal: pathspec 'push' did not match any files

USER@LAPTOP-L1U2P979 MINGW64 /d/seleniumTest (ft/setup)
$ git stash push 
Saved working directory and index state WIP on ft/setup: fb84427 create placeholder for test.java

USER@LAPTOP-L1U2P979 MINGW64 /d/seleniumTest (ft/setup)
$ git checkout main
Switched to branch 'main'
Your branch is up to date with 'origin/main'.

USER@LAPTOP-L1U2P979 MINGW64 /d/seleniumTest (main)
$ git checkout ft/setup
Switched to branch 'ft/setup'
Your branch is up to date with 'origin/ft/setup'.

USER@LAPTOP-L1U2P979 MINGW64 /d/seleniumTest (ft/setup)
$ git switch main
Switched to branch 'main'
Your branch is up to date with 'origin/main'.

USER@LAPTOP-L1U2P979 MINGW64 /d/seleniumTest (main)
$ touch test.java

USER@LAPTOP-L1U2P979 MINGW64 /d/seleniumTest (main)
$ git checkout ft/setup
error: The following untracked working tree files would be overwritten by checkout:
        test.java
Please move or remove them before you switch branches.
Aborting

USER@LAPTOP-L1U2P979 MINGW64 /d/seleniumTest (main)
$ git add test.java

USER@LAPTOP-L1U2P979 MINGW64 /d/seleniumTest (main)
$ git commit -m "add test.java on main"
[main 6f10b68] add test.java on main
 1 file changed, 6 insertions(+)
 create mode 100644 test.java

USER@LAPTOP-L1U2P979 MINGW64 /d/seleniumTest (main)
$ git push origin main
Enumerating objects: 4, done.
Counting objects: 100% (4/4), done.
Delta compression using up to 12 threads
Compressing objects: 100% (3/3), done.
Writing objects: 100% (3/3), 423 bytes | 211.00 KiB/s, done.
Total 3 (delta 0), reused 0 (delta 0), pack-reused 0 (from 0)
To https://github.com/Sabine-Ziza/git-devOps-ci-cd-gate.git
   a4a5ba0..6f10b68  main -> main

USER@LAPTOP-L1U2P979 MINGW64 /d/seleniumTest (main)
$ git add test.java

USER@LAPTOP-L1U2P979 MINGW64 /d/seleniumTest (main)
$ git commit -m "second commit"
[main a0a6181] second commit
 1 file changed, 1 insertion(+)

USER@LAPTOP-L1U2P979 MINGW64 /d/seleniumTest (main)
$ git push origin main
Enumerating objects: 5, done.
Counting objects: 100% (5/5), done.
Delta compression using up to 12 threads
Compressing objects: 100% (3/3), done.
Writing objects: 100% (3/3), 354 bytes | 354.00 KiB/s, done.
Total 3 (delta 1), reused 0 (delta 0), pack-reused 0 (from 0)
remote: Resolving deltas: 100% (1/1), completed with 1 local object.
To https://github.com/Sabine-Ziza/git-devOps-ci-cd-gate.git
   6f10b68..a0a6181  main -> main

USER@LAPTOP-L1U2P979 MINGW64 /d/seleniumTest (main)
$ git checkout ft/setup
Switched to branch 'ft/setup'
Your branch is up to date with 'origin/ft/setup'.

USER@LAPTOP-L1U2P979 MINGW64 /d/seleniumTest (ft/setup)
$ git merge main
Auto-merging test.java
CONFLICT (add/add): Merge conflict in test.java
Automatic merge failed; fix conflicts and then commit the result.
```