# Repository instructions

This repository is Michael Polanczyk's engineering project portfolio. Keep it easy to browse and extend.

## Read before editing

1. Read the root README for the project list.
2. Read the selected project's README and the relevant supporting pages.
3. Read docs/maintaining-projects.md before adding or reorganizing a project.
4. Read that project's media/manifest.json before moving, renaming, or deduplicating media.

## Structure and navigation

- The root README is a title page and project selector only. Do not embed a full build story, project gallery, autoplay media, or an automatically selected project there.
- Keep each project under projects/<project-id>/. The current IDs are rc-airplane, modot-bridge-2026, gear-calculator, custom-pc, and clear-app.
- Keep project details and media in that project's folder. Use stable lowercase IDs and relative links.
- Every project README and supporting page must have a compact linked navigation row directly below its title. Start with All projects and Project home, then include all actual project sections in the same order and with the same labels throughout that project. Adjust relative paths on nested pages; do not link nonexistent pages. An Explore section lower down does not replace this row. Use the project's README as its entry point.
- Add new projects using templates/project/README.md and one new row in the root table. Create supporting pages and media subfolders only when needed.
- Put shared maintenance guidance in docs/, not in a project's build story.
- Work only on the requested project unless a shared change is necessary.

## Accuracy and voice

- Preserve Michael's first-person account and design attribution.
- Separate completed work, plans, estimates, AI suggestions, and measured results.
- Do not invent dates, measurements, prices, design details, results, or scholarship eligibility.
- Keep bridge results blank until confirmed. Optimizer predictions are not test results.
- Use confirmed capture dates for media order; otherwise label the order approximate. Do not use upload dates as capture dates.
- Preserve existing source links and check dates. Verify sources if changing time-sensitive factual claims.
- Keep actual spending separate from estimates, excluded costs, tax, shipping, and payment-method adjustments.

## Media handling

- Keep files in the selected project's media/photos, media/videos, media/thumbnails, media/receipts, or media/drawings folder as applicable.
- Keep original media bytes unchanged during organization. Clearly identify converted or compressed viewing copies.
- Remove duplicate file entries only after an exact file-hash match; retain every distinct recording, even if footage overlaps.
- Update every link and manifest path when moving files. Preserve source names, source IDs, checksum fields, and duplicate mappings.
- Preserve receipt redactions and never replace them with private originals.
- Do not upload or link the bridge recordings IMG_2828.mp4 and IMG_2828(1).mp4; Michael canceled their publication. Keep the bridge Videos page and media/videos/ folder available for future testing footage.
- The airplane's original HEIC/MOV files are not included here; its JPEG/MP4 viewing copies and original metadata are included.

## Verify and finish

- Check relative Markdown links, image sources, page anchors, and manifest paths.
- Confirm all previously unique media hashes remain represented after a reorganization.
- Confirm the root README remains a chooser and all projects are reachable.
- Inspect the current branch before publishing. Preserve unrelated changes and use a normal commit; do not rewrite history.
- Report the completed change and material limitations concisely.
- If available usage runs out, pause as Michael requested. Save a short checkpoint with the commit/branch, completed work, remaining tasks, and blocked uploads when possible. Never claim a background retry or automatic resumption unless it is actually configured.

## Shared portfolio style

Keep the personal portfolio as the main introduction and this repository as the detailed project library. Preserve mutual links and separate licenses. Use the shared presentation standard in docs/maintaining-projects.md. The project overview uses At a glance and Project guide tables, then background, approach/progress, actual results where available, next steps, and credits. Do not add empty sections to existing projects. Keep selector statuses synchronized with the personal portfolio when editing them. Optional supporting templates live in templates/project/ and are starting points, not finished projects.
