package snippet;

public class Snippet {
	echo "# team_test" >> README.md
	git init
	git add README.md
	git commit -m "first commit"
	git branch -M main
	git remote add origin https://github.com/wlsgud0452/team_test.git
	git push -u origin main
}

