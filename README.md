# HelloWorld Java Exercises

Small Java practice project with three standalone source files in `src/`.

## Project Files

- `src/Hello.java` - basic variables, operators, and `IO.println(...)` output examples.
- `src/Bouncer.java` - reads a shoe size from `args[0]` and prints a size label (`XL`, `L`, `M`, `S`, or custom).
- `src/MagicDoor.java` - checks whether `args[0]` matches the magic word (`1234`).

## Prerequisites

- A Java JDK installed (`java -version`).
- An `IO` helper available in your runtime/classroom environment (all files use `IO.println(...)`).

> Note: This project currently does not include an `IO.java` file in the repository.

## Run

From the project root (`HelloWorld/`), run the source files directly:

```bash
java src/Hello.java
java src/Bouncer.java 42
java src/MagicDoor.java 1234
```

If your Java setup requires preview features for top-level `main` methods, use:

```bash
java --enable-preview --source 21 src/Hello.java
java --enable-preview --source 21 src/Bouncer.java 42
java --enable-preview --source 21 src/MagicDoor.java 1234
```

## Expected Examples

- `Bouncer` with `42` -> `Your shoes size equivalent is L`
- `MagicDoor` with `1234` -> `You found the magic word`

